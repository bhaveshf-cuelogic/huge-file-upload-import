package com.hhstechgroup.vyp.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class DataIntegrityFailedMessageDecoratorProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub
        Message msg = exchange.getIn();
        Exception e = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        exchange.getIn().setBody(
                "File name : "+ msg +
                "\nErroneous row data : "+ msg.getBody() +
                "\nException : " + e.toString()
                );
    }

}
