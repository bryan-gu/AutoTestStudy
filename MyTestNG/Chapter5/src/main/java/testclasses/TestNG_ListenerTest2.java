package testclasses;

import listenerspackage.CustomerListener1;
import listenerspackage.CustomerListener2;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomerListener2.class)
public class TestNG_ListenerTest2 {

    @BeforeClass
    public void setUP(){
        System.out.println("Code in beforeClass");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("Code in afterClass");
    }

    @Test
    public void testMethod1(){
        System.out.println("TestNG_ListenerTest2:Code in testMethod1");
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2(){
        System.out.println("TestNG_ListenerTest2:Code in testMethod2");
        Assert.assertTrue(false);
    }
}
