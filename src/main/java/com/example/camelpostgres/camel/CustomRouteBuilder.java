package com.example.camelpostgres.camel;

import com.example.camelpostgres.util.PropertyUtil;
import org.apache.camel.builder.RouteBuilder;

public class CustomRouteBuilder extends RouteBuilder {
    String uri =
            "database://postgresql?url=" + PropertyUtil.getProperty("db.url") +
                    "&user=" + PropertyUtil.getProperty("db.username") +
                    "&password=" + PropertyUtil.getProperty("db.password") +
                    "&initialDelay=" + PropertyUtil.getProperty("camel.initialDelay") +
                    "&delay=" + PropertyUtil.getProperty("camel.delay");
    @Override
    public void configure() throws Exception {

        System.out.println("Database URI: " + uri);

        from(uri)
                .log("Polling database");
    }
}
