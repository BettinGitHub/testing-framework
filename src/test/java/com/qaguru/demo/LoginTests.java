package com.qaguru.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, testName = "Login test with valid credentials")
    public void loginWithValidUser() {
        System.out.println("Login test with a valid username and password");
        // Assert.fail("Login Test failed"); //to make a test failed
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act, exp, "The words don't match");
    }
    @Test(priority = 3)
    public void loginWithInvalidUser(){
        System.out.println("Login with invalid user");
        Assert.fail("Invalid user login test failed");
    }

    @Test(priority = 2, testName = "Home Page Test")
    public void homePageTest(){
        System.out.println("This is a home page test");
        String exp = "Homepage";
        String act = "Homepage";
        Assert.assertTrue(exp==act, "Home page title is incorrect");
        Assert.fail("Home page title test failed");
    }

    @Test(priority = 4)
    public void logoutTest(){
        System.out.println("This is a logout test");
    }


}
