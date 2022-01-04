package com.fontelira.sentrypoc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.LoggerFactory;

@Path("/hello")
public class ReactiveGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws Exception {
        LoggerFactory.getLogger(this.getClass()).error("Fake error");
        //throw new Exception("Runtime exception sentry test");
        return "Hello Sentry!";
    }
}
