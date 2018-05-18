package com.github.shazin.greeter.starter.config;

import com.github.shazin.greeter.service.GreeterService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreeterService.class)
public class GreeterServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GreeterService greeterService() {
        return new GreeterService("Welcome", "Mr");
    }

}
