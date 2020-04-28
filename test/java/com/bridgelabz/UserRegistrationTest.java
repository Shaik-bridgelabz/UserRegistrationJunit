package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Shaik");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1= validator.validateFirstName("sh");
        Assert.assertEquals(true,result1);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLasttName("Mohammed");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1= validator.validateLasttName("Mo");
        Assert.assertEquals(true,result1);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmail("abc@bridgelabz.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1=validator.validateEmail("abc.@bridgelabz.com");
        Assert.assertEquals(true,result1);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validatePassword("Shaik@123");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result1=validator.validatePassword("shaik123");
        Assert.assertEquals(true,result1);
    }
}
