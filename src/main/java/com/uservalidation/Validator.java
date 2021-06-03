package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String MOBILE_NUMBER_PATTERN = "^^[+91]+ [6-9]{1}[0-9]{9}";
    public boolean validateMobileNumber(String mobileNumber)
    {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.find();
    }
}