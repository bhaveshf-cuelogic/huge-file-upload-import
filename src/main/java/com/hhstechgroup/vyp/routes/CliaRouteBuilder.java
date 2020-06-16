package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import com.hhstechgroup.vyp.aggregator.CliaAggregator;
import com.hhstechgroup.vyp.aggregator.NpiAggregator;
import com.hhstechgroup.vyp.model.Clia;
import com.hhstechgroup.vyp.model.NppesNPI;
import com.hhstechgroup.vyp.processor.CliaRecordProcessor;
import com.hhstechgroup.vyp.processor.NpiRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class CliaRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(Clia.class);
        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/clia/?noop=true")
        .routeId("fileMessageFromCliaFolder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individualCliaRecord");

        from("direct:individualCliaRecord")
        .routeId("individualCliaRowRecord")
        .errorHandler(
                defaultErrorHandler()
                .redeliveryDelay(2000)
                .maximumRedeliveries(15)
                .retryAttemptedLogLevel(LoggingLevel.ERROR)
              )
        .process(new CliaRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository("clia"))
        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new CliaAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into clia(prvdr_ctgry_sbtyp_cd, prvdr_ctgry_cd) values (:#id, :#name)?batch=true")
        .end();
    }
}