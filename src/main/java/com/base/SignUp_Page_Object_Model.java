package com.base;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class SignUp_Page_Object_Model {

	

	public SignUp_Page_Object_Model() {
}




	public static WebElement getUserName() {
		
		return userName;
	}
	public static WebElement getPassword() {
		return password;
	}
	public static WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public static WebElement getFullName() {
		return fullName;
	}
	public static WebElement getEmailAddress() {
		return emailAddress;
	}
	public static WebElement getTermsAndCondition() {
		return termsAndCondition;
	}
	public static WebElement getRegister() {
		return register;
	}
	public static WebElement getCaptchaText() {
		return captchaText;
	}
	@FindBy(id="username")
	private static  WebElement userName;
	@FindBy(id="password")
	private static  WebElement password;
	@FindBy(id="re_password")
	private static  WebElement confirmPassword;
	@FindBy(id="full_name")
	private static  WebElement fullName;
	@FindBy(id="email_add")
	private static  WebElement emailAddress;
	@FindBy(id="tnc_box")
	private static  WebElement termsAndCondition;
	@FindBy(id="Submit")
	private static  WebElement register;
	@FindBy(id="captcha-form")
	private static WebElement captchaText ;

	//	
	//	public static  WebElement userName(WebDriver driver) {
	//		return driver.findElement(By.id("username"));
	//	}
	//	public static WebElement password(WebDriver driver) {
	//		return driver.findElement(By.id("password"));
	//	}
	//	
	//	public static WebElement confirmPassword(WebDriver driver) {
	//		return driver.findElement(By.id("re_password"));
	//	}
	//	
	//	public static WebElement fullName(WebDriver driver) {
	//		return driver.findElement(By.id("full_name"));
	//	}
	//	
	//	public static WebElement emailAddress(WebDriver driver) {
	//		return driver.findElement(By.id("email_add"));
	//	}
	//	


	//	public static WebElement termsAndCondition(WebDriver driver) {
	//		return driver.findElement(By.id("tnc_box"));
	//	}
	//	
	//	public static WebElement register(WebDriver driver) {
	//		return driver.findElement(By.id("Submit"));
	//	}
	//	

}
