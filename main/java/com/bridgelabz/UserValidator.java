package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String EMAIL_ADDRESS_PATTERN ="^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}+([.][a-zA-Z]{2})?$";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";

    public boolean validateFirstName(String fName)
    {
        Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLasttName(String lName)
    {
        Pattern pattern=Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lName).matches();
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
}
