package com.cuelogic.camel.demo.client;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.sql.SqlComponent;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.processor.aggregate.jdbc.JdbcAggregationRepository;
import org.apache.camel.spi.AggregationRepository;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spring.spi.SpringTransactionPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.cuelogic.camel.demo.model.Sale;

public class V5JdbcRepositoryDemo {

    private static final Logger LOG = LoggerFactory.getLogger(V5JdbcRepositoryDemo.class);

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/bhaveshdb";
    private static final String DB_USER = "bhavesh";
    private static final String DB_PASS = "password";
    private static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";

    public static void main(String[] args) throws Exception {
        CamelContext ctx = new DefaultCamelContext();
        ctx.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);

        DriverManagerDataSource ds = new DriverManagerDataSource(DB_URL, DB_USER, DB_PASS);
        ds.setDriverClassName(DB_DRIVER_CLASS_NAME);

        ctx.getRegistry().bind("camelDs", ds);

        final DataFormat bindySaleFormat = new BindyCsvDataFormat(Sale.class);

        ctx.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/cuelogic.local/bhavesh.furia/camel/input/trimmed/ultra?noop=true")
                //setDeadLetterUri
                .errorHandler(defaultErrorHandler().redeliveryDelay(5000).maximumRedeliveries(10).retryAttemptedLogLevel(LoggingLevel.ERROR))
                .split(body().tokenize("\n"))
              //TODO : discard first row of input
                .streaming()
                .unmarshal(bindySaleFormat)
//                .process(new Processor() {
//                    public void process(Exchange exchange) throws Exception {
//                        // TODO Auto-generated method stub
//                        Sale s = new Sale();
//                        s = (Sale)exchange.getIn().getBody();
//                        System.out.println("------"+s.getCountry());
//                        exchange.getIn().setHeader("uniqueKey", s.toString());
//                    }
//                })
                .aggregate(constant(true), new AggregationStrategy() {
                    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                        Message newIn = newExchange.getIn();
                        Sale sale = (Sale)newIn.getBody();
//                        System.out.println("Body =========== "+sale);
                        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
//                        creating a map because sql-component does not support custom object as input
//                        for custom object support, you need to use myBatis component
//                        refer : https://camel.465427.n5.nabble.com/Store-CSV-file-to-Mysql-DB-using-Camel-Bindy-and-Camel-sql-got-stucked-td5747812.html
                        Map<String, String> m = new HashMap<String, String>();
                        if (oldExchange == null) { //first iteration
                            list = new ArrayList<Map<String, String>>();
                            m.put("region", sale.getRegion());
                            m.put("country", sale.getCountry());
                            m.put("item_type", sale.getItem_Type());
                            list.add(m);
                            newIn.setBody(list);
                            return newExchange;
                        } else { //second iteration onwards
                            Message in = oldExchange.getIn();
                            list = in.getBody(ArrayList.class);
                            m.put("region", sale.getRegion());
                            m.put("country", sale.getCountry());
                            m.put("item_type", sale.getItem_Type());
                            list.add(m);
                            return oldExchange;
                        }
                    }
                  })
                .completionSize(5)
                .completionTimeout(2000)
                .aggregationRepository(getAggregationRepository())
                .to("sql:insert into sales(region, country, item_type) values (:#region, :#country, :#item_type)?batch=true")
                .end();
            }
        });
        while (true) {
            ctx.start();
        }
    }

    private static AggregationRepository getAggregationRepository() {
        // TODO Auto-generated method stub
        SingleConnectionDataSource ds = new SingleConnectionDataSource(DB_URL, DB_USER, DB_PASS, true);
        ds.setAutoCommit(false);
        DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds);
        // repositoryName (aggregation) must match tableName (aggregation, aggregation_completed)
        JdbcAggregationRepository repo = new JdbcAggregationRepository(txManager, "aggregation", ds);
        repo.setUseRecovery(false);
        repo.setStoreBodyAsText(false);
        return (AggregationRepository) repo;
    }
}