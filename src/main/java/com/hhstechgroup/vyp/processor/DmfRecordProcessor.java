package com.hhstechgroup.vyp.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.hhstechgroup.vyp.utility.MD5Hashable;

public class DmfRecordProcessor implements Processor, MD5Hashable {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub
        String msg = exchange.getIn().getBody(String.class);
        exchange.getIn().setHeader("msgHash", generateMD5Digest(msg.toString()));
    }

}
