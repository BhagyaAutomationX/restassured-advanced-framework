package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass
        implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println(
                "TEST STARTED : "
                        + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println(
                "TEST PASSED : "
                        + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println(
                "TEST FAILED : "
                        + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {

        System.out.println(
                "SUITE STARTED");
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println(
                "SUITE FINISHED");
    }
}
