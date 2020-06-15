package com.hhstechgroup.vyp.routes;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

public class LeieRouteBuilder extends RouteBuilder {

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
        File fileStore = new File("camel/leie-exclusion-idempotent-repo.log");
        return new FileIdempotentRepository(fileStore, repoMap);
    }
    
    public static String generateMD5Digest(String msg) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        md.update(msg.getBytes());
        byte[] digest = md.digest();
//        LOG.debug("Digest for `" + msg + "` = " + digest);

        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
//        LOG.debug("Digest for `" + msg + "` in hex format : " + hexString.toString());
        return hexString.toString();
    }
}
