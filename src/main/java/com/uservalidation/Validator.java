package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String PASSWORD_PATTERN = "(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,}";
    public boolean validatePassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}