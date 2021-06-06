package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2}[a-z]*";
    private static final String EMAIL_PATTERN = "^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}";
    private static final String MOBILE_NUMBER_PATTERN = "^^[+91]+ [6-9]{1}[0-9]{9}";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}";

    public boolean validateFirstName(String firstName) throws UserValidationCustomExceptions {
        try {
            return patternChecker(firstName, NAME_PATTERN);
        } catch(Exception | UserValidationCustomExceptions exception){
            throw new UserValidationCustomExceptions("Invalid first name");
        }
    }

    public boolean validateLastName(String lastName) throws UserValidationCustomExceptions {
        try {
            return patternChecker(lastName, NAME_PATTERN);
        }catch(Exception | UserValidationCustomExceptions exception){
            throw new UserValidationCustomExceptions("Invalid Last name");
        }
    }

    public boolean validateEmail(String email) throws UserValidationCustomExceptions {
        try {
            return patternChecker(email, EMAIL_PATTERN);
        }catch(Exception | UserValidationCustomExceptions exception){
            throw new UserValidationCustomExceptions("Invalid Email");
        }
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserValidationCustomExceptions {
        try {
            return patternChecker(mobileNumber, MOBILE_NUMBER_PATTERN);
        }catch(Exception | UserValidationCustomExceptions exception){
            throw new UserValidationCustomExceptions("Invalid Mobile Number");
        }
    }

    public boolean validatePassword(String password) throws UserValidationCustomExceptions {
        try {
            return patternChecker(password, PASSWORD_PATTERN);
        }catch(Exception | UserValidationCustomExceptions exception){
            throw new UserValidationCustomExceptions("Invalid Password");
        }
    }

    private static boolean patternChecker(String input, String inputPattern) throws UserValidationCustomExceptions
    {
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}