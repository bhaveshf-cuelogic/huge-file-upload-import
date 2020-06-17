package com.hhstechgroup.vyp.aggregator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.Message;

import com.hhstechgroup.vyp.model.TherapySpeech;

public class SpeechTherapyAggregator implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        // TODO Auto-generated method stub
        Message newIn = newExchange.getIn();
        TherapySpeech obj = (TherapySpeech)newIn.getBody();
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> m = new HashMap<String, String>();
        if (oldExchange == null) { //first iteration
            list = new ArrayList<Map<String, String>>();
            m.put("id", obj.getName());
            m.put("name", obj.getLicense_type());
            list.add(m);
            newIn.setBody(list);
            return newExchange;
        } else { //second iteration onwards
            Message in = oldExchange.getIn();
            list = in.getBody(ArrayList.class);
            m.put("id", obj.getName());
            m.put("name", obj.getLicense_type());
            list.add(m);
            return oldExchange;
        }
    }

}
