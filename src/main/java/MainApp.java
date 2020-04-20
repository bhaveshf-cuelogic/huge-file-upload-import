import org.apache.camel.CamelContext;
import org.apache.camel.component.dataformat.DataFormatComponent;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.DataFormat;

public class MainApp {

    public static void main(String[] args) throws Exception {
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();

        CamelContext ctx = new DefaultCamelContext();
        ctx.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);

        ctx.addRoutes(routeBuilder);
        while(true) {
            ctx.start();
        }
        //Thread.sleep(1*60*1000);
        //ctx.stop();
    }
}