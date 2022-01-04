package com.fontelira.sentrypoc;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.andersonlira.sentry9.extension.runtime.Logger;

@Path("/hello")
public class ReactiveGreetingResource {
    
    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        logger.info("from quarkus logger");
        return "Hello Sentry!";
    }
}
