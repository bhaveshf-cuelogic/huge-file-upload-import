import java.io.File;
import java.util.ArrayList;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.model.dataformat.CsvDataFormat;
import org.apache.camel.spi.DataFormat;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		errorHandler(deadLetterChannel("mock:error"));
		BindyCsvDataFormat bindy = new BindyCsvDataFormat();

		from("file:/home/cuelogic.local/bhavesh.furia/input?noop=false").split(body().tokenize("\n"))
//    	.streaming()
				// .unmarshal(bindy)
				.aggregate(constant(true), new AggregationStrategy() {
					public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
						// TODO Auto-generated method stub
						// System.out.println("In aggregate");
						Message newIn = newExchange.getIn();
						Object newBody = newIn.getBody();
						ArrayList list = null;
						if (oldExchange == null) {
							list = new ArrayList();
							list.add(newBody);
							newIn.setBody(list);
							return newExchange;
						} else {
							Message in = oldExchange.getIn();
							list = in.getBody(ArrayList.class);
							list.add(newBody);
							return oldExchange;
						}
					}
				}).completionSize(10).process(new Processor() {

					public void process(Exchange exchange) throws Exception {
						// TODO Auto-generated method stub
						System.out.println("Reached in process block");
						System.out.println("Message ------" + exchange.getIn().getBody(String.class));
					}
				}).end();
//        from("file:/home/cuelogic.local/bhavesh.furia/input?noop=false").id("csv")
//        .onCompletion().log("Processing finished").end()
//        .log("Processing data from ${file:name}")
//        .split(body().tokenize("\n")).streaming()
//        .choice()
//          .when(simple("${body} contains 'name'")) //strip out the header if it exists
//           .log("Skipping first line as that's detected as header")
//           .endChoice()
//          .otherwise()
//            .log("Processing employee record")
//            .to("seda:processEmployee?size=40&concurrentConsumers=20&blockWhenFull=true")
//            .endChoice();
//        from("seda:processEmployee")
//        .log("Body received from Seda : ${body}")
//        .aggregate()
//        .log("Aggregated 10 results = ${body}")
//        .end();
//        .process(new IndividualMessageProcessor())
//        .end();
	}

}