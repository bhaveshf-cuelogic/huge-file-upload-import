import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

    public static void main(String[] args) throws Exception {
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        ctx.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);
        ctx.addRoutes(routeBuilder);
        ctx.start();
        Thread.sleep(1 * 60 * 1000); // don't know why we need to add sleep
        ctx.stop();
    }
}