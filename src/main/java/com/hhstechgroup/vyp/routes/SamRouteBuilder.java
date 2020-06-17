package com.hhstechgroup.vyp.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

import com.hhstechgroup.vyp.aggregator.SamAggregator;
import com.hhstechgroup.vyp.model.SAM;
import com.hhstechgroup.vyp.processor.SamRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class SamRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(SAM.class);
        final String datasource_name = "sam";

        // TODO Auto-generated method stub
        from("file:camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .choice()
        .when(body().startsWith("BOF PUBLIC"))
            .log("Ignoring message because a header row is detected - "+body())
            .to("file:camel/ignore")
        .when(body().startsWith("EOF PUBLIC"))
            .log("Ignoring message because a footer row is detected"+body())
            .to("file:camel/ignore")
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
        .process(new SamRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
//        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new SamAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into sam(duns, duns_plus_4) values (:#id, :#name)?batch=true")
        .end();
    }
}
