package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2}[a-z]*";
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.find();
    }
}