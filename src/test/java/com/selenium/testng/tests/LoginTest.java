package com.selenium.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBaseClass {
	
 @Test(groups = {"demo"})
    public void testLoginApllication() throws Exception {
	 HomePage homepage = new HomePage(driver);
	 String LogOutText = homepage.VerifyLogOut();
	 Assert.assertEquals(LogOutText, "LogOut");
	System.out.println("Succesfully Logged into application");
}

 @Test (groups= {"session"})
  public void testInvalidLoginApplication() {
   System.out.println("InCorrect Login Details");
}
 @Test (groups= {"demo"})
   public void testLogOutApplication() {
	 System.out.println("LoggedOut From Application");
 }
}
