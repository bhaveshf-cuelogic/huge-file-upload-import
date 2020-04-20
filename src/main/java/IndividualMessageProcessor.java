import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.LoggerFactory;

public class IndividualMessageProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {
		System.out.println("Message = "+exchange.getIn().getBody());
//		List<Employee> employees = (List<Employee>) exchange.getIn().getBody();
//		for (Employee employee : employees) {
//			System.out.println("Name---------------"+employee.getFirst_name());
//		}
	}

}
