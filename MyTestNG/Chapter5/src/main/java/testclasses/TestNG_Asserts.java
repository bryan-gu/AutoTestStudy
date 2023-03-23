package testclasses;

import applicationcode.ClassToBeTested;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {
    @Test
    public void testAddNum(){
        System.out.println("\n测试两个数相加是否正确");
        ClassToBeTested obj = new ClassToBeTested();
        int result = obj.addNum(1,2);
        Assert.assertEquals(result,3);
    }

    @Test
    public void testStrings(){
        System.out.println("\n对比连接后的字符串");
        String expectedString = "Hello World";
        ClassToBeTested obj = new ClassToBeTested();
        String result = obj.addStrings("Hello","World");
        Assert.assertEquals(result,expectedString);
    }

    @Test
    public void testArrays(){
        System.out.println("\n测试两组数组是否相等");
        ClassToBeTested obj = new ClassToBeTested();
        int[] result = obj.getArray();
        int[] expectedArray = {1,2,3,4};
        Assert.assertEquals(result,expectedArray);//一旦断言失败，则当前方法下的后续语句不再执行，但其他测试方法会继续执行
        System.out.println("\n测试两组数组是否相等---->测试完成");
    }
}
