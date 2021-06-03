package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void givenPasswordRule1_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validatePassword("nicenani");
        Assertions.assertEquals(true,status);
    }
}