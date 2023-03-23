package testclasses;

import applicationcode.ClassToBeTested;
import org.testng.annotations.Test;

public class TestAnnotation {


    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void atest3(){
        System.out.println("test3");
    }
    @Test
    public void test1(){
        ClassToBeTested test = new ClassToBeTested();
        int result = test.addNum(2,7);
        System.out.println("test1"+result);
    }
}
