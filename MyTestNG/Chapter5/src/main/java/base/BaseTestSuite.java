package base;

import org.testng.annotations.*;

public class BaseTestSuite {
    @BeforeClass
    public void beforeClass(){
        System.out.println("\nBaseTestSuite--->BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("\nBaseTestSuite--->afterClass");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("\nBaseTestSuite--->BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("\nBaseTestSuite--->AfterTest");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("\nBaseTestSuite--->BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("\nBaseTestSuite--->AfterSuite");
    }

}
