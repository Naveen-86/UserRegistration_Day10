package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    // Valid Test Cases
    @Test
    void givenEmail_itIsValid1_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@yahoo.com");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid2_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc-100@yahoo.com");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid3_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc.100@yahoo.com");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid4_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc111@abc.com");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid5_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc-100@abc.net");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid6_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc.100@abc.com.au");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid7_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@1.com");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid8_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@gmail.com.com");
        Assertions.assertEquals(true,status);
    }

    @Test
    void givenEmail_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc+100@gmail.com");
        Assertions.assertEquals(true,status);
    }
    // Invalid Test Cases

    @Test
    void givenEmail_itIsValid9_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid10_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@.com.my");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid11_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc123@gmail.a");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid12_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc123@.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid13_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc123@.com.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid14_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail(".abc@abc.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid15_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc()*@gmail.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid16_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@%*.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid17_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc..2002@gmail.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid18_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc.@gmail.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid19_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@abc@gmail.com");
        Assertions.assertEquals(false,status);
    }

    @Test
    void givenEmail_itIsValid20_returnFalse() {
        Validator validator = new Validator();
        boolean status = validator.validateEmail("abc@gmail.com.1a");
        Assertions.assertEquals(false,status);
    }
}