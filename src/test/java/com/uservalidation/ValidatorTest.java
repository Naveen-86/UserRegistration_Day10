package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void givenMobileNumber_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateMobileNumber("+91 9919819801");
        Assertions.assertEquals(true,status);
    }
}