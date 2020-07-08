package com.hhstechgroup.vyp;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.processor.aggregate.jdbc.JdbcAggregationRepository;
import org.apache.camel.spi.AggregationRepository;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.hhstechgroup.vyp.routes.CliaRouteBuilder;
import com.hhstechgroup.vyp.routes.DeathMasterRouteBuilder;
import com.hhstechgroup.vyp.routes.LeieRouteBuilder;
import com.hhstechgroup.vyp.routes.NPIRouteBuilder;
import com.hhstechgroup.vyp.routes.OccupationalTherapyRouteBuilder;
import com.hhstechgroup.vyp.routes.PhysicalTherapyRouteBuilder;
import com.hhstechgroup.vyp.routes.SamRouteBuilder;
import com.hhstechgroup.vyp.routes.SpeechTherapyRouteBuilder;
import com.hhstechgroup.vyp.routes.TrashRouteBuilder;

public class VypDataImportApplication {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/bhaveshdb";
    private static final String DB_USER = "bhavesh";
    private static final String DB_PASS = "password";
    private static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";

    public static void main(String[] args) throws Exception {
        final CamelContext camel = new DefaultCamelContext();
        camel.getShutdownStrategy().setShutdownRoutesInReverseOrder(true);
        camel.addRoutes(new TrashRouteBuilder()); // working
        camel.addRoutes(new LeieRouteBuilder()); // working
        camel.addRoutes(new DeathMasterRouteBuilder()); // working
        camel.addRoutes(new NPIRouteBuilder()); // working
        camel.addRoutes(new CliaRouteBuilder()); // working but skip the header row
        camel.addRoutes(new SamRouteBuilder()); // working
        camel.addRoutes(new SpeechTherapyRouteBuilder()); // working - escape top 3-5 lines before processing
        camel.addRoutes(new OccupationalTherapyRouteBuilder()); // working but few records didn't go to DB - escape top 3-5 lines before processing
        camel.addRoutes(new PhysicalTherapyRouteBuilder()); // working but few records didn't go to DB - escape top 3-5 lines before processing

        DriverManagerDataSource ds = new DriverManagerDataSource(DB_URL, DB_USER, DB_PASS);
        ds.setDriverClassName(DB_DRIVER_CLASS_NAME);
        camel.getRegistry().bind("camelDs", ds);
        while (true) {
            camel.start();
        }
    }

//    private static AggregationRepository getAggregationRepository() {
//        // TODO Auto-generated method stub
//        // ideally this repo's DB should be different from business db
//        SingleConnectionDataSource ds = new SingleConnectionDataSource(DB_URL, DB_USER, DB_PASS, true);
//        ds.setAutoCommit(false);
//        DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds);
//        // repositoryName (aggregation) must match tableName (aggregation,
//        // aggregation_completed)
//        JdbcAggregationRepository repo = new JdbcAggregationRepository(txManager, "aggregation", ds);
//        repo.setUseRecovery(true);
//        repo.setMaximumRedeliveries(5);
//        repo.setDeadLetterUri("direct:trash");
//        repo.setRecoveryInterval(3000);
//        return (AggregationRepository) repo;
//    }
}
