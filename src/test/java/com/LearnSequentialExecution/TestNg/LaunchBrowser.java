package com.LearnSequentialExecution.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@DataProvider(name="login",indices = {1})
	public String[][] getData() {
		String[][] data= new String[2][2];
		data[0][0] ="Muthu@gmail.com";
		data[0][1] ="Muth%123";
		data[1][0] = "Muthu@gmail.com";
		data[1][1] ="Mu#132";
		return data;
	}

	@Test(dataProvider = "login",timeOut = 10000)

	public void chromeBrowserLaunch2(String user, String pass) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kutty\\eclipse-workspace\\jeeva\\Selenium_Batch_10Am(sep12)\\ChromeUpdated\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// up casting
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.quit();
	}

}
