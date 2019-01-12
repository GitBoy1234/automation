package com.qa.gbpp.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    public static ExtentReports extent;

    public static ExtentReports creatInstance(){

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\\\Report\\\\TestResults.html");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Test");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Test");


        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;

    }
}
