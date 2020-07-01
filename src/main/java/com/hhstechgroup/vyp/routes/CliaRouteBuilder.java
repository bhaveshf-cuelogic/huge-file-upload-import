package com.hhstechgroup.vyp.routes;

import java.sql.SQLException;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.hhstechgroup.vyp.aggregator.CliaAggregator;
import com.hhstechgroup.vyp.aggregator.NpiAggregator;
import com.hhstechgroup.vyp.model.Clia;
import com.hhstechgroup.vyp.model.NppesNPI;
import com.hhstechgroup.vyp.processor.CliaRecordProcessor;
import com.hhstechgroup.vyp.processor.GenerateFailureResponse;
import com.hhstechgroup.vyp.processor.NpiRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class CliaRouteBuilder extends RouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(Clia.class);
        final String datasource_name = "clia";

        // TODO Auto-generated method stub
        onException(CannotGetJdbcConnectionException.class)
            .maximumRedeliveries(10)
            .redeliveryDelay(2000)
            .useExponentialBackOff();

        from("file:camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .choice()
            .when(body().contains("CITY_NAME"))
                .log("Ignoring message because a header row is detected - "+body())
                .to("direct:trash")
            .otherwise()
                .to("direct:individual"+datasource_name+"Record");

        from("direct:individual"+datasource_name+"Record")
        .routeId("individual"+datasource_name+"RowRecord")
//        .errorHandler(
//                defaultErrorHandler()
//                .redeliveryDelay(2000)
//                .maximumRedeliveries(3)
//                .retryAttemptedLogLevel(LoggingLevel.ERROR)
//              )
//        .errorHandler(
//                deadLetterChannel("direct:dlq")
//                .useOriginalMessage()
//                .maximumRedeliveries(3)
//                .redeliveryDelay(2000)
//                .retryAttemptedLogLevel(LoggingLevel.ERROR)
//                )
        .process(new CliaRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
        .unmarshal(bindyObj)
        .aggregate(constant(true), new CliaAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into clia(prvdr_ctgry_sbtyp_cd, prvdr_ctgry_cd) values (:#id, :#name)?batch=true")
//      .to("mybatis:insertAccount?statementType=Insert")
        .end();
    }
}
