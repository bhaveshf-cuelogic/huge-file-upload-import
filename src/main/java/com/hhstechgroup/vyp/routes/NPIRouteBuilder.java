package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import com.hhstechgroup.vyp.aggregator.NpiAggregator;
import com.hhstechgroup.vyp.model.NppesNPI;
import com.hhstechgroup.vyp.processor.NpiRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class NPIRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(NppesNPI.class);
        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/nppes-npi/?noop=true")
        .routeId("fileMessageFromNpiFolder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individuaNpiRecord");

        from("direct:individuaNpiRecord")
        .routeId("individualNpiRowRecord")
        .errorHandler(
                defaultErrorHandler()
                .redeliveryDelay(2000)
                .maximumRedeliveries(15)
                .retryAttemptedLogLevel(LoggingLevel.ERROR)
              )
        .process(new NpiRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository("nppes-npi"))
        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new NpiAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into nppes_npi(npi, entity_type_code) values (:#id, :#name)?batch=true")
        .end();
    }
}
