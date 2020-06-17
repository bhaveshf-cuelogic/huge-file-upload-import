package com.cuelogic.camel.demo.client;

import java.io.File;

import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;

import com.amazonaws.regions.Regions;

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