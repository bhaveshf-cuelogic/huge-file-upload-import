package com.hhstechgroup.vyp.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class VyPBaseRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        onException(CannotGetJdbcConnectionException.class)
            .maximumRedeliveries(10)
            .redeliveryDelay(2000)
            .useExponentialBackOff();

        errorHandler(deadLetterChannel("direct:dlq"));

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

        from("direct:dlq")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                // TODO Auto-generated method stub
                Message msg = exchange.getIn();
                Exception e = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
                exchange.getIn().setBody(
                        "Message : "+ msg +
                        " Message Body : "+ msg.getBody() +
                        " Exception : " + e.toString()
                        );
            }
        })
        .to("log:Message came in DLQ?level=WARN")
        .stop();
    }

}
