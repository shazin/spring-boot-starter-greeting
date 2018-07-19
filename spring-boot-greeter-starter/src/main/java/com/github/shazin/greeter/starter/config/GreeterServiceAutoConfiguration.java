package com.github.shazin.greeter.starter.config;

import com.github.shazin.greeter.service.GreeterService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreeterService.class)
@EnableConfigurationProperties(GreeterProperties.class)
public class GreeterServiceAutoConfiguration {

    private final GreeterProperties greeterProperties;

    public GreeterServiceAutoConfiguration(GreeterProperties greeterProperties) {
        this.greeterProperties = greeterProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "greeter", value = "greeting")
    public GreeterService greeterService() {
        return new GreeterService(greeterProperties.getGreeting(), greeterProperties.getSalutation());
    }

}
