package listenerspackage;


import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class CustomerListener1 implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //�ڲ������е����з�������֮ǰ����
        System.out.println("beforeInvocation:"+testResult.getTestClass().getName()+" ---> "+method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        //�ڲ������е����з�������֮������
        System.out.println("afterInvocation:"+testResult.getTestClass().getName()+" ---> "+testResult.getName());
    }

}
