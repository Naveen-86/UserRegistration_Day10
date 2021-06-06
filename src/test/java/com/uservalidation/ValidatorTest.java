package com.uservalidation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidatorTest {
    public String email;
    public boolean status;
    Validator validator = new Validator();

    public ValidatorTest(String email, boolean status) {
        this.email = email;
        this.status = status;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abcyahoo.com",false},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},{"abc",false},{"abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},{"abc()*@gmail.com",false},{"abc@%*.com",false},{"abc..2002@gmail.com",false},{"abc.@gmail.com",false},{"abc@abc@gmail.com",false}});
    }

    @Test
    public void emailChecker() {
        try {
            System.out.println(this.email);
            boolean result = validator.validateEmail(email);
            Assert.assertEquals(this.status, result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}