package testclasses;

import org.testng.annotations.*;

public class TestNG_BeforeClassAnnotation {
    @BeforeClass
    public void setUp(){
        System.out.println("在类里所有的方法运行之前运行");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("在类里所有的方法运行之后运行");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @Test
    public void testMethod1(){
        System.out.println("testMethod1");
    }
    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
    }
}
