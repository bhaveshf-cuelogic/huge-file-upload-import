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
                System.out.println("Trash msg Class------------"+m.getClass());
                System.out.println("Trash msg toString----------"+m.toString());
                System.out.println("Trash mg Body-----------------"+m.getBody());
            }
        })
        .stop();
    }
}
