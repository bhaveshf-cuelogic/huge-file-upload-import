package com.hhstechgroup.vyp.routes;

import org.apache.camel.builder.RouteBuilder;

public class TrashRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        from("direct:trash").stop();
    }

}
