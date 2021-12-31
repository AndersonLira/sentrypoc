package com.fontelira.sentrypoc;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import io.sentry.Sentry;

@Path("/hello")
public class ReactiveGreetingResource {

    private Logger LOG = Logger.getLogger(ReactiveGreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        // String msg =Sentry.getCurrentHub().getOptions().getDsn();
        // Sentry.init(msg);
        LOG.error("DSN: " + Sentry.getCurrentHub().getOptions().getDsn());
        //String dsn = "http://4be3491ff6d3497bb8c52a5e013260d2@localhost:8080/2";
        //Sentry.init(dsn);
        Sentry.captureMessage("message Quarkus");
        Sentry.captureException(new Exception("Test exception Quarkus"));
        //throw new RuntimeException("throwning exc");
        return "Hello RESTEasy sentry";
    }
}
