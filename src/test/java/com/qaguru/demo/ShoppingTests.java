package com.qaguru.demo;

import org.junit.runners.Suite;
import org.testng.annotations.*;

public class ShoppingTests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@@@ Before Suite executed @@@");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@@@ After Suite executed @@@");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("___Before Test executed___");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("___After Test executed___");
    }

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

    @Test
    public void productSearch(){
        System.out.println("Searching for a product");
    }

    @Test
    public void addProductToShoppingCart(){
        System.out.println("Ading a product to shopping cart");
    }

}
