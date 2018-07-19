package com.github.shazin.greeter.service.exception;

public class InvalidSalutationException extends RuntimeException {

    private String salutation;

    public InvalidSalutationException(String message, String salutation) {
        super(message);
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
