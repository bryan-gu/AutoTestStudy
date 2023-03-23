package listenerspackage;


import org.testng.*;

public class CustomerListener3 implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        //当<suite>标签开始执行时执行
        System.out.println("onStart:<suite>开始执行之前");
    }

    @Override
    public void onFinish(ISuite suite) {
        //当<suite>标签执行结束之后执行
        System.out.println("onFinish:<suite>执行结束之后");
    }
}
