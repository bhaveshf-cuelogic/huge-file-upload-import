package com.hhstechgroup.vyp.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.processor.aggregate.jdbc.JdbcAggregationRepository;
import org.apache.camel.spi.AggregationRepository;
import org.apache.camel.spi.DataFormat;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.hhstechgroup.vyp.aggregator.CliaAggregator;
import com.hhstechgroup.vyp.model.Clia;
import com.hhstechgroup.vyp.processor.CliaRecordProcessor;
import com.hhstechgroup.vyp.processor.DataIntegrityFailedMessageDecoratorProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class CliaRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(Clia.class);
        final String datasource_name = "clia";
        final String component = "sql";
        final String database_query = "insert into clia(prvdr_ctgry_sbtyp_cd, prvdr_ctgry_cd) values (:#id, :#name)";

        // TODO Auto-generated method stub
        onException(CannotGetJdbcConnectionException.class)
            .maximumRedeliveries(10)
            .redeliveryDelay(2000)
            .useExponentialBackOff();

        from("file:camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .choice()
            .when(body().contains("CITY_NAME"))
                .log("Ignoring message because a header row is detected - "+body())
                .to("direct:trash")
            .otherwise()
                .to("direct:individual"+datasource_name+"Record");

        from("direct:individual"+datasource_name+"Record")
        .routeId("individual"+datasource_name+"RowRecord")
//        .errorHandler(
//                defaultErrorHandler()
//                .redeliveryDelay(2000)
//                .maximumRedeliveries(3)
//                .retryAttemptedLogLevel(LoggingLevel.ERROR)
//              )
//        .errorHandler(
//                deadLetterChannel("direct:dlq")
//                .useOriginalMessage()
//                .maximumRedeliveries(3)
//                .redeliveryDelay(2000)
//                .retryAttemptedLogLevel(LoggingLevel.ERROR)
//                )
        .process(new CliaRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
        .unmarshal(bindyObj)
        .aggregate(constant(true), new CliaAggregator())
        .completionSize(50)
        .completionTimeout(2000)
//        .aggregationRepository(getAggregationRepository())
        .doTry()
            .to(component+":"+database_query+"?batch=true")
//          .to("mybatis:insertAccount?statementType=Insert")
        .doCatch(DataIntegrityViolationException.class)
            .to("direct:"+datasource_name+"dataIntegrityViolatedBatchProcessor")
        .endDoTry();

        from("direct:"+datasource_name+"dataIntegrityViolatedBatchProcessor")
        .split(body())
        .doTry()
            .to(component+":"+database_query)
        .doCatch(DataIntegrityViolationException.class)
            .process(new DataIntegrityFailedMessageDecoratorProcessor())
            .to("kafka:test?brokers=localhost:9092")
//            .to("log:DataIntegrityViolationException raised?level=WARN")
        .endDoTry();
    }

    private static AggregationRepository getAggregationRepository() {
        // TODO Auto-generated method stub
        // ideally this repo's DB should be different from business db
        final String DB_URL = "jdbc:postgresql://localhost:5432/bhaveshdb";
        final String DB_USER = "bhavesh";
        final String DB_PASS = "password";
        SingleConnectionDataSource ds = new SingleConnectionDataSource(DB_URL, DB_USER, DB_PASS, true);
        ds.setAutoCommit(false);
        DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds);
        // repositoryName (aggregation) must match tableName (aggregation, aggregation_completed)
        JdbcAggregationRepository repo = new JdbcAggregationRepository(txManager, "aggregation", ds);
        repo.setUseRecovery(true);
        repo.setMaximumRedeliveries(3);
        repo.setDeadLetterUri("direct:trash");
        repo.setRecoveryInterval(2000);
        return (AggregationRepository) repo;
    }
}
