package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.SingleKeyAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.base.CreateAccount_FB;
import com.base.SearchProduct;
import com.base.SignUp_Page_Object_Model;

public class LogIn  extends Base_Class {
	static WebDriver driver;
	@Test(expectedExceptions = NullPointerException.class)
	public static void logIN() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutty\\eclipse-workspace\\jeeva\\DataDriven\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		//tagname[text()='FullText']
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Base_Class.rightclick(findElement);

		SignUp_Page_Object_Model ref = new SignUp_Page_Object_Model();
		inputvalues(ref.getFullName(), "java");







	}

}
