package com.hhstechgroup.vyp.routes;

import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.dao.DataIntegrityViolationException;

import com.hhstechgroup.vyp.aggregator.DmfAggregator;
import com.hhstechgroup.vyp.model.DeathMaster;
import com.hhstechgroup.vyp.processor.DataIntegrityFailedMessageDecoratorProcessor;
import com.hhstechgroup.vyp.processor.DmfRecordProcessor;
import com.hhstechgroup.vyp.utility.Idempotentable;

public class DeathMasterRouteBuilder extends VyPBaseRouteBuilder implements Idempotentable {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        super.configure();
        final DataFormat bindyObj = new BindyFixedLengthDataFormat(DeathMaster.class);
        final String datasource_name = "death-master";
        final String component = "sql";
        final String database_query = "insert into dmf(action, ssn) values (:#id, :#name)";

        from("file:camel/input/vyp/"+datasource_name+"/?noop=true")
        .routeId("fileMessageFrom"+datasource_name+"Folder")
        .split(body().tokenize("\n"))
        .streaming()
        .to("direct:individual"+datasource_name+"Record");

        from("direct:individual"+datasource_name+"Record")
        .routeId("individual"+datasource_name+"RowRecord")
        .process(new DmfRecordProcessor())
        .idempotentConsumer(header("msgHash"), getIdempotentRepository(datasource_name))
//        .log("Processing msg")
        .unmarshal(bindyObj)
        .aggregate(constant(true), new DmfAggregator())
        .completionSize(50)
        .completionTimeout(5000)
//        .aggregationRepository(getAggregationRepository())
        .doTry()
            .to(component+":"+database_query+"?batch=true")
    //      .to("mybatis:insertAccount?statementType=Insert")
        .doCatch(DataIntegrityViolationException.class)
            .to("direct:"+datasource_name+"dataIntegrityViolatedBatchProcessor")
        .endDoTry();

        from("direct:"+datasource_name+"dataIntegrityViolatedBatchProcessor")
        .split(body())
        .doTry()
            .to(component+":"+database_query)
        .doCatch(DataIntegrityViolationException.class)
            .process(new DataIntegrityFailedMessageDecoratorProcessor())
            .to("kafka:test?brokers=localhost:9092")
//            .to("log:DataIntegrityViolationException raised?level=WARN")
        .endDoTry();
    }

}
