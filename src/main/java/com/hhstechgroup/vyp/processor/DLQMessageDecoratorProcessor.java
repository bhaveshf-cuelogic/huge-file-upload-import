package com.hhstechgroup.vyp.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class DLQMessageDecoratorProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub
        Message m = exchange.getIn();
        System.out.println("Message = " + m + "-----Body-----" + m.getBody() + "------MessageId---------" + m.getMessageId());
        exchange.getIn().setBody("File name : "+ m + " Erroneous row data : "+ m.getBody());
    }

}
