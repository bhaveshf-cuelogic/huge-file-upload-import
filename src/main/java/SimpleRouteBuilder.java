import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        DataFormat bindy = new BindyCsvDataFormat(Employee.class);

        from("file:/home/cuelogic.local/bhavesh.furia/input?noop=false")
        .split(body().tokenize("\n"))
        .streaming()
//        .unmarshal(bindy)
        .process(new IndividualMessageProcessor())
        .end();
        //.split(body())
        //.process(new IndividualMessageProcessor())
//        .choice()
//        .when(simple("${file:ext} == 'csv'"))
//        .log("CSV File found")
//        .to("file:/home/cuelogic.local/bhavesh.furia/output/csv")
//        .otherwise()
//        .when(simple("${file:ext} == 'txt'"))
//        .log("TXT File found")
        //.to("file:/home/cuelogic.local/bhavesh.furia/output/txt");
    }

}