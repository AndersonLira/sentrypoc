package com.fontelira.sentrypoc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.sentry.Sentry;

@Path("/hello")
public class ReactiveGreetingResource {
    @ConfigProperty(name="sentry.dsn")
    String dsn;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Sentry.init(dsn);
        Sentry.capture("message Quarkus");
        Sentry.capture(new Exception("Test exception Quarkus"));
        return "Hello Sentry!";
    }
}
