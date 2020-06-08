package com.cuelogic.camel.demo.client;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;
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
        
        Map repoMap = new HashMap<String, Object>();
        File fileStore = new File("camel/idempotent-repo.log");
        final IdempotentRepository repo = new FileIdempotentRepository(fileStore, repoMap);

        final BindyCsvDataFormat bindySaleFormat = new BindyCsvDataFormat(Sale.class);

        ctx.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/cuelogic.local/bhavesh.furia/camel/input/trimmed?noop=false")
//                .split(body().tokenize("\n"))
                .unmarshal(bindySaleFormat)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        // TODO Auto-generated method stub
                        Sale sObj = new Sale();
                        sObj = exchange.getMessage(Sale.class);
                        System.out.println("-----------------------"+sObj.getRegion());
                    }
                })
                .to("direct:seda")
                .end();
            }
        });
        while (true) {
            ctx.start();
        }
    }
}