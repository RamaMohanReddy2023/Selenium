package com.selenium.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	private By hamburger_Loc = By.id("react-burger-menu-btn");
	private By Logout_Loc = By.id("logout_sidebar_link");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String VerifyLogOut() throws Exception {
		Thread.sleep(5000);
		driver.findElement(hamburger_Loc).click();
		Thread.sleep(3000);
		String text = driver.findElement(Logout_Loc).getText();
		return text;
		
	}
}

