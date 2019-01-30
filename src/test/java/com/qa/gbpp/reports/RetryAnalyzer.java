package com.qa.gbpp.reports;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import com.qa.gbpp.base.TestBase;

public class RetryAnalyzer extends TestBase implements IRetryAnalyzer {



    int counter=0;
    int retrylimit = Integer.parseInt(prop.getProperty("retryLimit"));


    @Override
    public boolean retry(ITestResult iTestResult) {


        if (counter < retrylimit){
            counter++;
            return  true;
        }


        return false;
    }
}
