package com.hhstechgroup.vyp.routes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
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
        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/leie/?noop=true")
        .routeId("fileMessageFromLeieFolder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individuaLeieRecord");

        from("direct:individuaLeieRecord")
        .routeId("individualRowRecord")
        .errorHandler(
                defaultErrorHandler()
                .redeliveryDelay(2000)
                .maximumRedeliveries(15)
                .retryAttemptedLogLevel(LoggingLevel.ERROR)
              )
        .process(new LeieRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository("leie-exclusion-idempotent-repo"))
        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new LeieAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into exclusions(lastname, firstname) values (:#id, :#name)?batch=true")
        .end();
    }
}
