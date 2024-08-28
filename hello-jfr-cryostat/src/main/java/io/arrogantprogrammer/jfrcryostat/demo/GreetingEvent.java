package io.arrogantprogrammer.jfrcryostat.demo;

import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("io.arrogantprogrammer.jfrcryostat.demo.GreetingEvent")
@Label("Greeting Event")
public class GreetingEvent extends Event {

    private String greeting;

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
