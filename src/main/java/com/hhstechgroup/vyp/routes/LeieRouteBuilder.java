package com.hhstechgroup.vyp.routes;

import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.dao.DataIntegrityViolationException;

import com.hhstechgroup.vyp.aggregator.LeieAggregator;
import com.hhstechgroup.vyp.model.LeieExclusion;
import com.hhstechgroup.vyp.processor.DataIntegrityFailedMessageDecoratorProcessor;
import com.hhstechgroup.vyp.processor.LeieRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class LeieRouteBuilder extends VyPBaseRouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        super.configure();
        final DataFormat bindyObj = new BindyCsvDataFormat(LeieExclusion.class);
        final String datasource_name = "leie-exclusion";
        final String component = "sql";
        final String database_query = "insert into exclusions(lastname, firstname) values (:#id, :#name)";

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
            .process(new DataIntegrityFailedMessageDecoratorProcessor())
            .to("kafka:test?brokers=localhost:9092")
//        .to("log:DataIntegrityViolationException raised?level=WARN")
        .endDoTry();
    }
}
