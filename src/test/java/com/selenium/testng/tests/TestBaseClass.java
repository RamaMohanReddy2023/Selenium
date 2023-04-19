package com.selenium.testng.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	static  WebDriver driver;
	private By Username_Loc = By.id("user-name");
	private By Password_Loc = By.id("password");
	private By Login_Loc = By.id("login-button");
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.findElement(Username_Loc).sendKeys("standard_user");
	    driver.findElement(Password_Loc).sendKeys("secret_sauce");
	    driver.findElement(Login_Loc).click();
	}

	public String takeScreenshot(String name) throws Exception {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		String path = "D:\\Selenium Software\\Workspace\\Selenium\\Screenshots\\"+name+"-"+timestamp+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(path);
		FileUtils.copyFile(source, target);
		return path;
		
	}
	
	
	
	
	
}
