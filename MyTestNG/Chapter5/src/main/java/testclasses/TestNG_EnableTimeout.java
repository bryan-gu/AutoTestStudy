package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeout {

    @BeforeClass
    public void setUp(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("AfterClass");
    }

    @Test(enabled = false)
    public void testMethod1(){
        System.out.println("testMethod1");
    }

    @Test(timeOut = 100)
    public void testMethod2(){
        System.out.println("testMethod2");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
