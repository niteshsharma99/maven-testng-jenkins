package com.testng.demo_testng_maven;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

    App app;

    @BeforeMethod
    public void setup() {
        app = new App();
        System.out.println("Setup method executed");
    }

    @Test
    public void testAddition() {
        int result = app.add(2, 3);
        Assert.assertEquals(result, 5);
    }

    @Test(dependsOnMethods = "testAddition")
    public void secondTest() {
        System.out.println("Second test executed after addition test");
    }
}
