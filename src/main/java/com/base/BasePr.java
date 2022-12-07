package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePr {

	private void browserLaunch(String element) {
		if (element.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutty\\eclipse-workspace\\jeeva\\Selenium_Batch_9AM\\driver\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         driver.get(element);
		}
		
	}


}
