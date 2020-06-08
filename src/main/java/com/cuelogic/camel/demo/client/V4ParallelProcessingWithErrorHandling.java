package com.cuelogic.camel.demo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.DataFormat;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cuelogic.camel.demo.model.Sale;

public class V4ParallelProcessingWithErrorHandling {

    public static void main(String[] args) throws Exception {
        CamelContext ctx = new DefaultCamelContext();
        ctx.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/bhaveshdb");
        ds.setUsername("bhavesh");
        ds.setPassword("password");
        ctx.getRegistry().bind("camelDs", ds);
        
        final DataFormat bindySaleFormat = new BindyCsvDataFormat(Sale.class);

        ctx.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/cuelogic.local/bhavesh.furia/camel/input/trimmed?noop=true")
                .split(body().tokenize("\n"))
              //TODO : discard first row of input
                .streaming()
                .parallelProcessing()
                .unmarshal(bindySaleFormat)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        // TODO Auto-generated method stub
                        Sale s = new Sale();
                        s = (Sale)exchange.getIn().getBody();
                        System.out.println("------"+s.getCountry());
                    }
                })
                .aggregate(constant(true), new AggregationStrategy() {
                    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                        Message newIn = newExchange.getIn();
                        Sale sale = (Sale)newIn.getBody();
                        System.out.println("Body =========== "+sale);
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
                .completionSize(50)
                .completionTimeout(2000)
                .to("sql:insert into sales(region, country, item_type) values (:#region, :#country, :#item_type)?batch=true")
                .end();
            }
        });
        while (true) {
            ctx.start();
        }
    }
}