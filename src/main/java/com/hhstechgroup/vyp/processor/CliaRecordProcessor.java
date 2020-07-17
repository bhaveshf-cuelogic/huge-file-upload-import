package com.hhstechgroup.vyp.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import com.hhstechgroup.vyp.utility.MD5Hashable;

public class CliaRecordProcessor implements Processor, MD5Hashable {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub
        Message m = exchange.getIn();
//        System.out.println("Message = "+m);
        String body = m.getBody(String.class);
        m.setHeader("msgHash", generateMD5Digest(body.toString()));
    }

}
