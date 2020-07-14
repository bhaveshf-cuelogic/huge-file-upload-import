package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

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
        final String component = "sql";
        final String database_query = "insert into wyoming_physical_therapy_licenses(last_name, first_name) values (:#id, :#name)";

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
        .process(new PhysicalTherapyRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
//        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new PhysicalTherapyAggregator())
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
