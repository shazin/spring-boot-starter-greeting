package com.github.shazin.greeter.starter.config;

import com.github.shazin.greeter.service.GreeterService;
import org.junit.Test;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.*;

public class GreeterServiceAutoConfigurationTest {

    @Test
    public void defaultGreeterServiceAutoConfiguration() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(TestConfiguration.class);
        annotationConfigApplicationContext.refresh();

        GreeterService greeterService = annotationConfigApplicationContext.getBean(GreeterService.class);

        assertThat("Welcome, Mr. Shazin").isEqualTo(greeterService.greet("Shazin"));

        annotationConfigApplicationContext.close();
    }

    @Configuration
    @ImportAutoConfiguration(GreeterServiceAutoConfiguration.class)
    static class TestConfiguration {

    }

}
