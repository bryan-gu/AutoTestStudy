package listenerspackage;

import org.testng.*;

public class CustomerListener implements IInvokedMethodListener, ITestListener, ISuiteListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //在测试类中的所有方法运行之前运行
        System.out.println("beforeInvocation:"+testResult.getTestClass().getName()+" ---> "+method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        //在测试类中的所有方法运行之后运行
        System.out.println("afterInvocation:"+testResult.getTestClass().getName()+" ---> "+testResult.getName());
    }
    @Override
    public void onTestStart(ITestResult result) {
        //测试方法开始时才执行此方法
        System.out.println("onTestStart ---> "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //如果测试方法执行成功，则执行此方法
        System.out.println("onTestSuccess ---> "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //如果测试方法执行失败，则执行此方法
        System.out.println("onTestFailure ---> "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //忽略
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
        //在XML文件的<test>标签执行之前执行
        System.out.println("onStart ---> "+context.getName());
        ITestNGMethod[] methods = context.getAllTestMethods();
        System.out.println("<test>标签中需要执行的测试方法:");
        for (ITestNGMethod method: methods) {
            System.out.println(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        //在XML文件的<test>标签执行之后执行
        System.out.println("onFinish ---> "+context.getName());
    }
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
