package com.selenium.testng.tests;

import org.testng.annotations.Test;

public class CartTest {

	@Test (groups= {"session"}  )
	public void testSingleItems() {
		System.out.println("Single Items in Cart");
	}
	@Test(groups= {"demo"})
	public void testMultipleItems() {
		System.out.println("Multiple Items in Cart");
	}
	@Test(groups= {"demo"})
	public void testEmptyCart() {
		System.out.println("No Items in Cart");
	}

	//adding fine
	
}


