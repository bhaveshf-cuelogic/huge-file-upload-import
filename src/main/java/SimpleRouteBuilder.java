import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/cuelogic.local/bhavesh.furia/input?noop=true&delay=3000")
        .process(new IndividualMessageProcessor())
        .choice()
        .when(simple("${file:ext} == 'csv'"))
        .log("CSV File found")
        .to("file:/home/cuelogic.local/bhavesh.furia/output/csv")
        .otherwise()
        .when(simple("${file:ext} == 'txt'"))
        .log("TXT File found")
        .to("file:/home/cuelogic.local/bhavesh.furia/output/txt");
    }

}