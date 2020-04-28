package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
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
}
