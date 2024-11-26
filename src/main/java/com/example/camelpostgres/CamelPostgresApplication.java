package com.example.camelpostgres;

import com.example.camelpostgres.camel.CustomRouteBuilder;
import com.example.camelpostgres.camel.DatabaseComponent;
import com.example.camelpostgres.util.DatabaseInitializer;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;



public class CamelPostgresApplication {

	public static void main(String[] args) throws Exception {
		DatabaseInitializer initializer = new DatabaseInitializer();
		initializer.initializeDatabase();

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addComponent("database", new DatabaseComponent());
		camelContext.addRoutes(new CustomRouteBuilder());

		camelContext.start();

		Thread.sleep(2 * 60 * 1000);

		camelContext.stop();
	}
}
