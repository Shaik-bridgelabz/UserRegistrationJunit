package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Shaik");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1= userValidator.validateFirstName("sh");
        Assert.assertFalse(result1);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLasttName("Mohammed");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1= userValidator.validateLasttName("Mo");
        Assert.assertFalse(result1);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validateEmail("abc@bridgelabz.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1=userValidator.validateEmail("abc.@bridgelabz.com");
        Assert.assertFalse(result1);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validateMobileNumber("91 8660424568");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotValid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1=userValidator.validateMobileNumber("8660424568");
        Assert.assertFalse(result1);
    }
    @Test
    public void givenMobileNumber_WithCharacters_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1=userValidator.validateMobileNumber("ABc0424568");
        Assert.assertFalse(result1);
    }

    @Test
    public void givenPassword_HasMoreThan8Characters_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validatePassword1("shaikmohammed");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_HasLessThan8Charcters_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1=userValidator.validatePassword1("shaik");
        Assert.assertFalse(result1);
    }

    @Test
    public void givenPassword_HasAtleast_1UpperCase_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validatePassword2("Shaikmohammed");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_HasNo_Uppercase_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1=userValidator.validatePassword2("shaik");
        Assert.assertFalse(result1);
    }

    @Test
    public void givenPassword_HasAtleast_1NumericNumber_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validatePassword3("Shaikmohammed12");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_HasNo_NumericNumber_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result1=userValidator.validatePassword3("shaikmohammed");
        Assert.assertFalse(result1);
    }
}
