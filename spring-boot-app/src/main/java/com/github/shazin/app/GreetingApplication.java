package com.github.shazin.app;

import com.github.shazin.greeter.service.GreeterService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GreetingApplication {

    public static void main(String... args) {
        SpringApplication.run(GreetingApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(GreeterService greeterService) {
        return args -> {
            System.out.println(greeterService.greet("Shazin"));
        };
    }

    // Uncomment to Override GreeterServiceAutoconfiguration greeterService
//    @Bean
//    public GreeterService greeterService() {
//        return new GreeterService("Greeting", "Dr");
//    }
}
