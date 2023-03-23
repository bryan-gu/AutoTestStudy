package testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import static org.testng.Assert.*;

public class TestNG_ReportsAndLogsTest {

    @BeforeClass
    public void setUp(){
        Reporter.log("TestNG_ReportsAndLogsTest ---> 在class运行之前运行",true);
    }

    @AfterClass
    public void cleanUp(){
        Reporter.log("TestNG_ReportsAndLogsTest ---> 在class运行之后运行",true);
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("TestNG_ReportsAndLogsTest ---> 在每个Test方法运行之前运行",true);
    }

    @AfterMethod
    public void afterMethod() {
        Reporter.log("TestNG_ReportsAndLogsTest ---> 在每个Test方法运行之后运行",true);
    }

    @Test
    public void testMethod1() {
        Reporter.log("TestNG_ReportsAndLogsTest ---> testMethod1",true);
    }

    @Test
    public void testMethod2() {
        Reporter.log("TestNG_ReportsAndLogsTest ---> testMethod2",true);
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"testMethod2"})
    public void testMethod3() {
        Reporter.log("TestNG_ReportsAndLogsTest ---> testMethod3",true);
    }

}