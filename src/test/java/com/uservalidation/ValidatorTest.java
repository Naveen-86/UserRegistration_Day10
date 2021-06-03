package com.uservalidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatorTest {
    @Test
    void givenLastName_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateLastName("Labz");
        assertEquals(true,status);
    }

    @Test
    void givenFirstName_whenShort_returnfalse() {
        Validator validator = new Validator();
        boolean status = validator.validateLastName("Br");
        assertEquals(false,status);
    }

    @Test
    void givenFirstName_whenInValid_returnfalse() {
        Validator validator = new Validator();
        boolean status = validator.validateLastName("bridgelabz");
        assertEquals(false,status);
    }
}