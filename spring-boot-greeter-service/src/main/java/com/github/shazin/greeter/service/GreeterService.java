package com.github.shazin.greeter.service;

import com.github.shazin.greeter.service.exception.InvalidSalutationException;

public class GreeterService {

    private final String salutation;
    private final String greeting;

    public GreeterService(String greeting, String salutation) {
        this.salutation = (salutation == null ? "Mr" : salutation);
        this.greeting = (greeting == null ? "Hello" : greeting);
        if (!Character.isUpperCase(this.salutation.charAt(0))) {
            throw new InvalidSalutationException("Invalid Salutation", this.salutation);
        }
    }

    public String greet(String name) {
        return greeting + ", " + salutation + ". " + name;
    }

}
