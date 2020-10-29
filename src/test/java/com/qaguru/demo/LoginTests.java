package com.qaguru.demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    @BeforeClass
    public void beforeClass(){
        System.out.println("**** Before class executed ****");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("%%%% After Class executed %%%%");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method Executed...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method Executed...");
    }

    @Test(priority = 1, testName = "Login test with valid credentials")
    public void loginWithValidUser() {
        System.out.println("Login test with a valid username and password");
        // Assert.fail("Login Test failed"); //to make a test failed
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act, exp, "The words don't match");
    }
    @Test(priority = 3, testName = "Login with an invalid Username and password")
    public void loginWithInvalidUser(){
        System.out.println("Login with a invalid user");
        //Assert.fail("Invalid user login test failed");
    }

    @Test(priority = 2, testName = "Verify Home Page Title")
    public void homePageTest(){
        System.out.println("This is a home page title test");
        String exp = "Homepage";
        String act = "Homepage";
        Assert.assertTrue(exp==act, "Home page title is incorrect");
    }

    @Test(priority = 4, testName="This is a Logout Test")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }


}
