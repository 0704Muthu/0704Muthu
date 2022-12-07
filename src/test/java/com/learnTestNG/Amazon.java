package com.learnTestNG;

import org.testng.annotations.Test;

public class Amazon  {
	
	@Test(priority = 1)
	private void signUp() {
		System.out.println("signUp");
		
	}

	@Test(priority = 2)
	public static void logIn() {
		System.out.println("login");
	}

}
