package com.github.shazin.greeter.starter.config;

import com.github.shazin.greeter.service.exception.InvalidSalutationException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class InvalidGreeterSalutationFailureAnalyzer extends AbstractFailureAnalyzer<InvalidSalutationException> {

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, InvalidSalutationException cause) {
        return new FailureAnalysis(String.format("The greeter service could not be auto-configured properly: '%s' is an invalid salutation", cause.getSalutation()),
                             "A valid salutation must begin with an upper-case letter",
                                   cause);
    }
}
