package com.qaguru.demo;

import org.testng.annotations.*;

public class ShoppingTests {

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
