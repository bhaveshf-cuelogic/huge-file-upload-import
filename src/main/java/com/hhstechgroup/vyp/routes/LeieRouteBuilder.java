package com.hhstechgroup.vyp.routes;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;

import com.hhstechgroup.vyp.model.LeieExclusion;
import com.hhstechgroup.vyp.utility.MD5Hashable;

public class LeieRouteBuilder extends RouteBuilder implements MD5Hashable {

    @Override
    public void configure() throws Exception {
        final DataFormat bindyObj = new BindyCsvDataFormat(LeieExclusion.class);

        // TODO Auto-generated method stub
        from("file:/home/cuelogic.local/bhavesh.furia/camel/input/vyp/leie/?noop=true")
        .routeId("fileMessageFromLeieFolder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individuaLeieRecord");

        from("direct:individuaLeieRecord")
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
                exchange.getIn().setHeader("msgHash", generateMD5Digest(msg.toString()));
            }
        })
        .idempotentConsumer(header("msgHash"), getIdempotentRepository())
        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new AggregationStrategy() {
            public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
                Message newIn = newExchange.getIn();
                LeieExclusion obj = (LeieExclusion)newIn.getBody();
                System.out.println("Body =========== "+obj);
                ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
                Map<String, String> m = new HashMap<String, String>();
                if (oldExchange == null) { //first iteration
                    list = new ArrayList<Map<String, String>>();
                    m.put("id", obj.getLast_name());
                    m.put("name", obj.getFirst_name());
                    list.add(m);
                    newIn.setBody(list);
                    return newExchange;
                } else { //second iteration onwards
                    Message in = oldExchange.getIn();
                    list = in.getBody(ArrayList.class);
                    m.put("id", obj.getLast_name());
                    m.put("name", obj.getFirst_name());
                    list.add(m);
                    return oldExchange;
                }
            }
        })
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .to("sql:insert into exclusions(lastname, firstname) values (:#id, :#name)?batch=true")
        .end();
    }
    
    private static IdempotentRepository getIdempotentRepository() {
        // TODO Auto-generated method stub
        Map repoMap = new HashMap<String, Object>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();

        File fileStore = new File("camel/leie-exclusion-idempotent-repo-"+dtf.format(now)+".log");
        return new FileIdempotentRepository(fileStore, repoMap);
    }
    
}
