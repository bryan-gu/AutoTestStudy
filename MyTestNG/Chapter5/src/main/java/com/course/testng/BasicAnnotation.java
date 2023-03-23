package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("TestCase1");
    }

    @Test
    public void testCase2(){
        System.out.println("TestCase2");
    }

    @Test(dependsOnMethods = "testCase2")
    public void testCase3(){
        System.out.println("TestCase3");
    }

    @Test(dependsOnMethods = "testCase1")
    public void testCase4(){
        System.out.println("TestCase4");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }
}
