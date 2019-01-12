package com.qa.gbpp.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNGListener implements ITestListener {

    public ExtentReports extent = ExtentManager.creatInstance();
    public ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public void onTestStart(ITestResult iTestResult) {

        System.out.println("Test has started "+ iTestResult.getName());
        ExtentTest extentTest = extent.createTest
                (iTestResult.getMethod().getMethodName(),iTestResult.getMethod().getDescription());
        test.set(extentTest);


    }

    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("Test has passed");
        test.get().pass("Test Passed");

    }

    public void onTestFailure(ITestResult iTestResult) {

       test.get().fail(iTestResult.getThrowable());
    }

    public void onTestSkipped(ITestResult iTestResult) {



    }








    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

        //System.out.print("teststart");

    }

    public void onFinish(ITestContext iTestContext) {

        extent.flush();

    }
}
