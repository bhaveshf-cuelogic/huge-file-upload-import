package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.hhstechgroup.vyp.aggregator.LeieAggregator;
import com.hhstechgroup.vyp.model.LeieExclusion;
import com.hhstechgroup.vyp.processor.LeieRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class LeieRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(LeieExclusion.class);
        final String datasource_name = "leie-exclusion";
        final String component = "sql";
        final String database_query = "insert into exclusions(lastname, firstname) values (:#id, :#name)";

        onException(CannotGetJdbcConnectionException.class)
            .maximumRedeliveries(10)
            .redeliveryDelay(2000)
            .useExponentialBackOff();

        from("file:camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .choice()
            .when(body().contains("LASTNAME"))
                .log("Ignoring message because a header row is detected - "+body())
                .to("direct:trash")
            .otherwise()
                .to("direct:individual"+datasource_name+"Record");

        from("direct:individual"+datasource_name+"Record")
        .routeId("individual"+datasource_name+"RowRecord")
        .errorHandler(
                defaultErrorHandler()
                .redeliveryDelay(2000)
                .maximumRedeliveries(15)
                .retryAttemptedLogLevel(LoggingLevel.ERROR)
              )
        .process(new LeieRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
//        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new LeieAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .doTry()
            .to(component+":"+database_query+"?batch=true")
//      .to("mybatis:insertAccount?statementType=Insert")
        .doCatch(DataIntegrityViolationException.class)
            .to("direct:"+datasource_name+"dataIntegrityViolatedBatchProcessor")
        .endDoTry();

        from("direct:"+datasource_name+"dataIntegrityViolatedBatchProcessor")
        .split(body())
        .doTry()
            .to(component+":"+database_query)
        .doCatch(DataIntegrityViolationException.class)
            .to("log:DataIntegrityViolationException raised?level=WARN")
        .endDoTry();
    }
}
