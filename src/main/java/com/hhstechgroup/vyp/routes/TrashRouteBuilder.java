package com.hhstechgroup.vyp.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class TrashRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        from("direct:trash")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                // TODO Auto-generated method stub
                Message m = exchange.getIn();
                System.out.println("Trash class------------"+m.getClass());
                System.out.println("Trash toString----------"+m.toString());
                System.out.println("Trash Body-----------------"+m.getBody());
            }
        })
        .stop();

//        from("direct:dlq")
//        .to("log:DLQMessage?level=ERROR")
//        .stop();
    }

}
