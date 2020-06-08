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
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class V3ParallelProcessingWithErrorHandling {

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

//        BindyCsvDataFormat bindy = new BindyCsvDataFormat(Sale.class);

        ctx.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/cuelogic.local/bhavesh.furia/input2?noop=false")
                .errorHandler(
                    defaultErrorHandler()
                    .redeliveryDelay(5000)
                    .maximumRedeliveries(10)
                    .retryAttemptedLogLevel(LoggingLevel.ERROR)
                  )
                .split(body().tokenize("\n"))
                .streaming()
                .parallelProcessing()
                .threads(5)
//                .unmarshal(bindy)
                .aggregate(constant(true), new AggregationStrategy() {
                  public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                      Message newIn = newExchange.getIn();
                      Object newBody = newIn.getBody();
//                      System.out.println("Body = "+newBody);
                      ArrayList list = new ArrayList<Map>();
                      Map m = new HashMap<String, String>();
                      if (oldExchange == null) {
                          list = new ArrayList();
                          m.put("data", newBody);
                          list.add(m);
                          newIn.setBody(list);
                          return newExchange;
                      } else {
                          Message in = oldExchange.getIn();
                          list = in.getBody(ArrayList.class);
                          m.put("data", newBody);
                          list.add(m);
                          return oldExchange;
                      }
                  }
                })
                .completionSize(50)
                .completionTimeout(2000)
//                .idempotentConsumer(header("CamelFileName"), repo)
                .to("sql:insert into temp(data) values (:#data)?batch=true")
//                .parallelProcessing()
                .end();
            }
        });
        while (true) {
            ctx.start();
        }
    }
}