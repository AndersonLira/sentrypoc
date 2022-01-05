package com.fontelira.sentrypoc;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/hello")
public class ReactiveGreetingResource {

    private final Logger LOGGER = LoggerFactory.getLogger(ReactiveGreetingResource.class);
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws Exception {
        LOGGER.error("Fake error");
        LOGGER.warn("Just an warning!");
        LOGGER.info("Just an info!");
        //Uncomment line 23 and comment 24 to see not uncaught behavior.
        //throw new Exception("Runtime exception sentry test");
        return "Hello Sentry!";
    }
}
