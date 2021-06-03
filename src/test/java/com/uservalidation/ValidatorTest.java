package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void givenEmail_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,status);
    }
}