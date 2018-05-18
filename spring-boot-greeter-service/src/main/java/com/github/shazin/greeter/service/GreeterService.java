package com.github.shazin.greeter.service;

public class GreeterService {

    private final String salutation;
    private final String greeting;

    public GreeterService(String greeting, String salutation) {
        this.salutation = salutation;
        this.greeting = greeting;
    }

    public String greet(String name) {
        return greeting + ", " + salutation + ". " + name;
    }

}
