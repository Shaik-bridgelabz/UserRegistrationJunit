package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String EMAIL_ADDRESS_PATTERN ="^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}+([.][a-zA-Z]{2})?$";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String PASSWORD_PATTERN1 = "[a-zA-Z0-9]{8,}";
    private static final String PASSWORD_PATTERN2 = "[a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*";
    private static final String PASSWORD_PATTERN3= "[a-zA-Z0-9]*[A-Z][a-zA-Z0-9]*[0-9][a-zA-Z0-9]*";
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLasttName(String lastName)
    {
        Pattern pattern=Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email)
    {
        Pattern pattern=Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String phone)
    {
        Pattern pattern=Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(phone).matches();
    }

    public boolean validatePassword1(String password)
    {
        Pattern pattern=Pattern.compile(PASSWORD_PATTERN1);
        return pattern.matcher(password).matches();
    }

    public boolean validatePassword2(String password)
    {
        Pattern pattern=Pattern.compile(PASSWORD_PATTERN2);
        return pattern.matcher(password).matches();
    }

    public boolean validatePassword3(String password)
    {
        Pattern pattern=Pattern.compile(PASSWORD_PATTERN3);
        return pattern.matcher(password).matches();
    }
}
