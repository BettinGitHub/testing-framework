package com.qaguru.demo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "userInfo")
    public Object[][] loginInfo(){
        return new Object[][]{
                {"john", "john123"},
                {"gopi", "gopi123"},
                {"bettin", "bettin123"}
        };
    }
}
