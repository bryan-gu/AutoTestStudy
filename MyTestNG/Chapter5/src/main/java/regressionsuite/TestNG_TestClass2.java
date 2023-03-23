package regressionsuite;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {
    @BeforeClass
    public void setUp(){
        System.out.println("\nTestNG_TestClass2--->BeforeClass--->在类里所有的方法运行之前运行");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("\nTestNG_TestClass2--->AfterClass--->在类里所有的方法运行之后运行");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\nTestNG_TestClass2--->BeforeMethod--->在每个方法运行之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("\nTestNG_TestClass2--->AfterMethod--->在每个方法运行之后运行");
    }
    @Test
    public void testMethod1(){
        System.out.println("\nTestNG_TestClass2--->testMethod1--->第一个测试方法运行");
    }
    @Test
    public void testMethod2(){
        System.out.println("\nTestNG_TestClass2--->testMethod2--->第二个测试方法运行");
    }
}
