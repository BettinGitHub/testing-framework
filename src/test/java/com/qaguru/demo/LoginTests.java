package com.qaguru.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, testName = "Login test with valid credentials")
    public void loginWithValidUser() {
        System.out.println("Login test with valid user and password");
        // Assert.fail("Login Test failed"); //to make a test failed
        String exp = "hello";
        String act = "Hello";
        Assert.assertEquals(act, exp, "The words don't match");
    }
    @Test(priority = 3)
    public void loginWithInvalidUser(){
        System.out.println("Login with invalid user");
    }

    @Test(priority = 2, testName = "Home Page Test")
    public void homePageTest(){
        System.out.println("This is a home page test");
    }

    @Test(priority = 4)
    public void logoutTest(){
        System.out.println("This is a logout test");
    }


}
