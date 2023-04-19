package com.selenium.testng.tests;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ReportListeners extends TestBaseClass implements ITestListener {
	ExtentReports extent =  ExtentReportsTestNG.getReportsObject();
	ExtentTest test;
	
	@Override		
    public void onTestStart(ITestResult result) {					
       test = extent.createTest(result.getMethod().getMethodName());
       		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
       test.log(Status.PASS,"Pass");						
    }
    @Override		
    public void onTestFailure(ITestResult result) {					
       test.log(Status.FAIL,"Failure");
       String filePath = null;
       try {
		filePath = takeScreenshot("Automation-");
	} catch (Exception e) {
		e.printStackTrace();
	}
       test.addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());
    }
       
       @Override		
       public void onFinish(ITestContext context) {					
         extent.flush();
       }
   

}

