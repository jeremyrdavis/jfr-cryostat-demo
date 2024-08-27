package io.arrogantprogrammer.jfrcryostat.demo;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class  GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Log.debug("Hello from GreetingResource");
        return service.randomGreeting();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String helloPost(final String name) {
        Log.debug("Saying Hello to " + name);
        return service.randomGreeting(name);
    }
}
