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
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.cuelogic.camel.demo.model.TempCSVModel;

public class V7AwsS3ToSqlDemo {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/bhaveshdb";
    private static final String DB_USER = "bhavesh";
    private static final String DB_PASS = "password";
    private static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";

    public static void main(String[] args) throws Exception {
        final CamelContext camel = new DefaultCamelContext();
        camel.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);

        DriverManagerDataSource ds = new DriverManagerDataSource(DB_URL, DB_USER, DB_PASS);
        ds.setDriverClassName(DB_DRIVER_CLASS_NAME);
        camel.getRegistry().bind("camelDs", ds);

        final DataFormat bindySaleFormat = new BindyCsvDataFormat(TempCSVModel.class);

        camel.addRoutes(new RouteBuilder() {
            // TODO Auto-generated method stub
            @Override
            public void configure() throws Exception {
                // TODO Auto-generated method stub
                from("aws2-s3://arn:aws:s3:::cameltest?"
                        + "deleteAfterRead=true&"
                        + "maxMessagesPerPoll=25&"
                        + "accessKey=ACCESS_KEY&"
                        + "secretKey=SECRET_KEY&"
                        + "destinationBucket=camelprocessed&"
                        + "moveAfterRead=true&"
                        + "region=ap-south-1")
//                from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp?noop=true")
                .routeId("fileMessageFromAwsS3")
                .split(body().tokenize("\n"))
                .streaming()
                .to("direct:individualrecord");

                from("direct:individualrecord")
                .routeId("individualRowRecord")
                .errorHandler(
                        defaultErrorHandler()
                        .redeliveryDelay(2000)
                        .maximumRedeliveries(15)
                        .retryAttemptedLogLevel(LoggingLevel.ERROR)
                      )
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        String msg = exchange.getIn().getBody(String.class);
                        System.out.println("Exchange input body = "+msg);
                        String[] s = msg.split(",");
                        System.out.println("Setting unique header for this msg as it's id column = "+s[0]);
                        exchange.getIn().setHeader("uniqueId", s[0]);
                    }
                })
                .idempotentConsumer(header("uniqueId"), getIdempotentRepository())
                .log("Processing msg")
                .unmarshal(bindySaleFormat)
                .aggregate(constant(true), new AggregationStrategy() {
                    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                        Message newIn = newExchange.getIn();
                        TempCSVModel sale = (TempCSVModel)newIn.getBody();
//                        System.out.println("Body =========== "+sale);
                        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
//                        creating a map because sql-component does not support custom object as input
//                        for custom object support, you need to use myBatis component
//                        refer : https://camel.465427.n5.nabble.com/Store-CSV-file-to-Mysql-DB-using-Camel-Bindy-and-Camel-sql-got-stucked-td5747812.html
                        Map<String, String> m = new HashMap<String, String>();
                        if (oldExchange == null) { //first iteration
                            list = new ArrayList<Map<String, String>>();
                            m.put("id", sale.getCol1());
                            m.put("name", sale.getCol2());
                            m.put("city", sale.getCol3());
                            list.add(m);
                            newIn.setBody(list);
                            return newExchange;
                        } else { //second iteration onwards
                            Message in = oldExchange.getIn();
                            list = in.getBody(ArrayList.class);
                            m.put("id", sale.getCol1());
                            m.put("name", sale.getCol2());
                            m.put("city", sale.getCol3());
                            list.add(m);
                            return oldExchange;
                        }
                    }
                })
                .completionSize(50)
                .completionTimeout(5000)
//                .aggregationRepository(getAggregationRepository())
                .to("sql:insert into sales(region, country, item_type) values (:#id, :#name, :#city)?batch=true")
                .end();
            }
        });
        while(true) {
            camel.start();
        }
    }
    
    private static AggregationRepository getAggregationRepository() {
        // TODO Auto-generated method stub
        // ideally this repo's DB should be different from business db
        SingleConnectionDataSource ds = new SingleConnectionDataSource(DB_URL, DB_USER, DB_PASS, true);
        ds.setAutoCommit(false);
        DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds);
        // repositoryName (aggregation) must match tableName (aggregation, aggregation_completed)
        JdbcAggregationRepository repo = new JdbcAggregationRepository(txManager, "aggregation", ds);
        return (AggregationRepository) repo;
    }

    private static IdempotentRepository getIdempotentRepository() {
        // TODO Auto-generated method stub
        Map repoMap = new HashMap<String, Object>();
        File fileStore = new File("camel/idempotent-repo.log");
        return new FileIdempotentRepository(fileStore, repoMap);
    }
}