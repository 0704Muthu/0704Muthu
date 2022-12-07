package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount_FB {
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private static WebElement firstname;

	@FindBy(name="lastname")
	private static WebElement lastname;


	@FindBy(name="reg_email__")
	private static WebElement email;


	@FindBy(name="reg_passwd__")
	private static WebElement password;


	public static WebElement getFirstname() {
		return firstname;
	}


	public static WebElement getLastname() {
		return lastname;
	}


	public static WebElement getEmail() {
		return email;
	}


	public static WebElement getPassword() {
		return password;
	}


	

	
}
