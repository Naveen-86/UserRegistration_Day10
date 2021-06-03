package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2}[a-z]*";
    public boolean validateLastName(String lastName)
    {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.find();
    }
}