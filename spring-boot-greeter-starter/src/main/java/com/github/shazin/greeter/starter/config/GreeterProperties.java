package com.github.shazin.greeter.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeter")
public class GreeterProperties {

    private String greeting;

    private String salutation;

    public String getGreeting() {
        return greeting;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
