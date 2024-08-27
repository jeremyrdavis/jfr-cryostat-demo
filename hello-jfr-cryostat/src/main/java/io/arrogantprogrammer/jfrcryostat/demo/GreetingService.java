package io.arrogantprogrammer.jfrcryostat.demo;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class GreetingService {

    List<String> greetings = new ArrayList<>(){{
        add("Hello RESTEasy");
        add("Hello Quarkus");
        add("Hello GraalVM");
    }};

    public String randomGreeting() {
        return greetings.get((int) (Math.random() * greetings.size()));
    }

    public String randomGreeting(String name) {
        return String.format("%s, and %s!", randomGreeting(), name);
    }
}
