package com.uservalidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatorTest {
    @Test
    void givenFirstName_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("Bridgelabz");
        assertEquals(true,status);
    }

    @Test
    void givenFirstName_whenShort_returnfalse() {
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("Br");
        assertEquals(false,status);
    }

    @Test
    void givenFirstName_whenInValid_returnfalse() {
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("bridgelabz");
        assertEquals(false,status);
    }
}