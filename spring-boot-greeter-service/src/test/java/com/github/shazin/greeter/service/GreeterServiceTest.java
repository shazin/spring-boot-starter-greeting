package com.github.shazin.greeter.service;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class GreeterServiceTest {

    @Test
    public void testGreet() {
        GreeterService greeterService = new GreeterService("Howdy!", "Mrs");

        String actual = greeterService.greet("Simpson");

        assertThat("Howdy!, Mrs. Simpson").isEqualTo(actual);
    }
}
