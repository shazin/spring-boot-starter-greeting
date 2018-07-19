package com.github.shazin.greeter.service;

import com.github.shazin.greeter.service.exception.InvalidSalutationException;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class GreeterServiceTest {

    @Test
    public void testGreet() {
        GreeterService greeterService = new GreeterService("Howdy!", "Mrs");

        String actual = greeterService.greet("Simpson");

        assertThat("Howdy!, Mrs. Simpson").isEqualTo(actual);
    }

    @Test(expected = InvalidSalutationException.class)
    public void invalidSalutation() {
        GreeterService greeterService = new GreeterService("Hello", "mr");
    }

    @Test
    public void defaultValues() {
        GreeterService greeterService = new GreeterService(null, null);

        String actual = greeterService.greet("Simpson");

        assertThat("Hello, Mr. Simpson").isEqualTo(actual);
    }
}
