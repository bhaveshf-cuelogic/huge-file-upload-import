package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import com.hhstechgroup.vyp.aggregator.NpiAggregator;
import com.hhstechgroup.vyp.aggregator.OccupationalTherapyAggregator;
import com.hhstechgroup.vyp.aggregator.PhysicalTherapyAggregator;
import com.hhstechgroup.vyp.aggregator.SamAggregator;
import com.hhstechgroup.vyp.aggregator.SpeechTherapyAggregator;
import com.hhstechgroup.vyp.model.NppesNPI;
import com.hhstechgroup.vyp.model.TherapyOccupational;
import com.hhstechgroup.vyp.model.TherapyPhysical;
import com.hhstechgroup.vyp.model.TherapySpeech;
import com.hhstechgroup.vyp.processor.NpiRecordProcessor;
import com.hhstechgroup.vyp.processor.OccupationalTherapyRecordProcessor;
import com.hhstechgroup.vyp.processor.PhysicalTherapyRecordProcessor;
import com.hhstechgroup.vyp.processor.SamRecordProcessor;
import com.hhstechgroup.vyp.processor.SpeechTherapyRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class PhysicalTherapyRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(TherapyPhysical.class);
        final String datasource_name = "physical-therapy";

        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individual"+datasource_name+"Record");

        from("direct:individual"+datasource_name+"Record")
        .routeId("individual"+datasource_name+"RowRecord")
        .errorHandler(
                defaultErrorHandler()
                .redeliveryDelay(2000)
                .maximumRedeliveries(15)
                .retryAttemptedLogLevel(LoggingLevel.ERROR)
              )
        .process(new PhysicalTherapyRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new PhysicalTherapyAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into wyoming_physical_therapy_licenses(last_name, first_name) values (:#id, :#name)?batch=true")
        .end();
    }
}
