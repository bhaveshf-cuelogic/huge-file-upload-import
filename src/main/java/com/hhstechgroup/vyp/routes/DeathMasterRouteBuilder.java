package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import com.hhstechgroup.vyp.aggregator.DmfAggregator;
import com.hhstechgroup.vyp.model.DeathMaster;
import com.hhstechgroup.vyp.processor.DmfRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class DeathMasterRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        final DataFormat bindyObj = new BindyCsvDataFormat(DeathMaster.class);
        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/dmf/?noop=true")
        .routeId("fileMessageFromDmfFolder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individuaDmfRecord");

        from("direct:individuaDmfRecord")
        .routeId("individualDmfRecord")
        .errorHandler(
                defaultErrorHandler()
                .redeliveryDelay(2000)
                .maximumRedeliveries(15)
                .retryAttemptedLogLevel(LoggingLevel.ERROR)
              )
        .process(new DmfRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository("death-master"))
        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new DmfAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into exclusions(lastname, firstname) values (:#id, :#name)?batch=true")
        .end();
    }

}
