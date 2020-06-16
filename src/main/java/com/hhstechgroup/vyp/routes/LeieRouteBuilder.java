package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import com.hhstechgroup.vyp.aggregator.LeieAggregator;
import com.hhstechgroup.vyp.model.LeieExclusion;
import com.hhstechgroup.vyp.processor.LeieRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class LeieRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(LeieExclusion.class);
        final String datasource_name = "leie-exclusion";

        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individua"+datasource_name+"Record");

        from("direct:individua"+datasource_name+"Record")
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
        .to("sql:insert into exclusions(lastname, firstname) values (:#id, :#name)?batch=true")
        .end();
    }
}
