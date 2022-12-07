package com.LearnSequentialExecution.TestNg;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class BrowserLaunchTwo {
	
	@Test(invocationCount = 2,threadPoolSize = 2)
	public  void chromeBrowserLaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutty\\eclipse-workspace\\jeeva\\Selenium_Batch_10Am(sep12)\\ChromeUpdated\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//		driver.findElement(By.name("q")).sendKeys("cricbuzz",Keys.ENTER);
		//		List<WebElement> cricbuzz = driver.findElements(By.xpath("//*[contains(text(),'Cricbuzz') or contains(text(),'cricbuzz')]"));
		//		System.out.println(cricbuzz.size());
		driver.quit();
	}
}
