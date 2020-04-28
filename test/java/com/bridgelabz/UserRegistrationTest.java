package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Shaik");
        Assert.assertTrue(true);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1= validator.validateFirstName("sh");
        Assert.assertFalse(false);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLasttName("Mohammed");
        Assert.assertTrue(true);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1= validator.validateLasttName("Mo");
        Assert.assertFalse(false);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmail("abc@bridgelabz.com");
        Assert.assertTrue(true);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1=validator.validateEmail("abc.@bridgelabz.com");
        Assert.assertFalse(false);
    }
}