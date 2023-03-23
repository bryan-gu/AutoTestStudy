package testclasses;

import org.testng.annotations.*;

public class TestNG_Priority {
    @BeforeClass
    public void setUp(){
        System.out.println("\nTestNG_Priority--->BeforeClass");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("\nTestNG_Priority--->AfterClass");
    }
    @Test(priority = 2)
    public void testMethod1(){
        System.out.println("\nTestNG_Priority--->testMethod1--->第一个测试方法运行");
    }
    @Test(priority = 1)
    public void testMethod2(){
        System.out.println("\nTestNG_Priority--->testMethod2--->第二个测试方法运行");
    }
    @Test(priority = 0)
    public void testMethod3(){
        System.out.println("\nTestNG_Priority--->testMethod3--->第二个测试方法运行");
    }
}
