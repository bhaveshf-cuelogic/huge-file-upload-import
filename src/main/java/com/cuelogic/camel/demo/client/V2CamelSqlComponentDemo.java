package com.cuelogic.camel.demo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class V2CamelSqlComponentDemo {

    public static void main(String[] args) throws Exception {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/bhaveshdb");
        ds.setUsername("bhavesh");
        ds.setPassword("password");

        CamelContext ctx = new DefaultCamelContext();
        ctx.getRegistry().bind("camelDs", ds);
        
        ctx.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/cuelogic.local/bhavesh.furia/input2?noop=false")
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        // TODO Auto-generated method stub
                        ArrayList<Map> l = new ArrayList<Map>();
                        Map<String, String> m = new HashMap<String, String>();
                        m.put("data", "dummy 4");
                        l.add(0, m);
                        l.add(1, m);
                        exchange.getIn().setBody(l);
                    }
                })
                .to("sql:insert into test(data) values (:#data)?batch=true");
            }
        });

        while (true) {
            ctx.start();
        }
    }
}