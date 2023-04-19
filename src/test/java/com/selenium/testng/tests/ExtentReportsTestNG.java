package com.selenium.testng.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTestNG {
	
	static ExtentReports extent;
	ExtentTest test;

	public static ExtentReports getReportsObject() {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		String path = "D:\\Selenium Software\\Workspace\\Selenium\\Reports\\Automation-"+timestamp+".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Execution Report");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}
}
