package testclasses;

import applicationcode.ClassToBeTested;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {
    @Test
    public void testSum(){
        SoftAssert sa = new SoftAssert();
        System.out.println("\n测试方法--->测试两个数相加");
        ClassToBeTested obj = new ClassToBeTested();
        int result = obj.addNum(1,2);
        sa.assertEquals(result,2);
        System.out.println("Assert1执行结束");
        sa.assertEquals(result,3);
        System.out.println("Assert2执行结束");
        sa.assertAll();
    }
}
