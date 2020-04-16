import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/cuelogic.local/bhavesh.furia/input?noop=true")
        .log("Test Message Hello")
        .streamCaching()
        .to("file:/home/cuelogic.local/bhavesh.furia/output");
    }

}