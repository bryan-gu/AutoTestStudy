package testclasses;

import applicationcode.ClassToBeTested;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DependentTests {
    ClassToBeTested obj;

    @BeforeClass
    public void setUP(){
        System.out.println("BeforeClass");
        obj = new ClassToBeTested();
    }

    @AfterClass
    public void cleanUP(){
        System.out.println("AfterClass");
    }

    @Test(dependsOnMethods = {"testMethod2"},alwaysRun = true)
    public void testMethod1(){
        System.out.println("testMethod1");
        String result = obj.addStrings("hello","world");
        String expected = "Hello World";
        Assert.assertEquals(result,expected);
    }

    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
        int result = obj.addNum(1,2);
        Assert.assertEquals(result,4);
    }

    @Test(dependsOnMethods = {"testMethod1"},alwaysRun = true)
    public void testMethod3(){
        System.out.println("testMethod3");
        int[] result = obj.getArray();
        //int[] expected = {1,3,5};
        int[] expected = {1,2,3};
        Assert.assertEquals(result,expected);
    }

    @Test
    public void testMethod4(){
        System.out.println("testMethod4");
    }
}
