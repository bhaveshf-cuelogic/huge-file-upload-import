package com.cuelogic.camel.demo.client;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.processor.aggregate.jdbc.JdbcAggregationRepository;
import org.apache.camel.spi.AggregationRepository;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.amazonaws.regions.Regions;
import com.cuelogic.camel.demo.model.Sale;

public class V6AwsS3Demo {

    public static void main(String[] args) throws Exception {
        CamelContext camel = new DefaultCamelContext();
        camel.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);

        camel.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("aws-s3://cameltest?deleteAfterRead=false&maxMessagesPerPoll=25&accessKey=ACCESS_KEY&secretKey=SECRET_KEY&region="+Regions.AP_SOUTH_1)
                .log(LoggingLevel.INFO, "consuming", "Consumer Fired!")
                .idempotentConsumer(header("CamelAwsS3ETag"),
                        FileIdempotentRepository.fileIdempotentRepository(new File("target/file.data"), 250, 512000))
                .log(LoggingLevel.INFO, "Replay Message Sent to file:s3out ${in.header.CamelAwsS3Key}")
                    .to("file:target/s3out?fileName=${in.header.CamelAwsS3Key}");
                }
        });
        while (true) {
            camel.start();
        }
    }
}