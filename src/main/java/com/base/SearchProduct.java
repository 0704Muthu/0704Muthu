package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {

	@FindBy(id="location")
	private static WebElement select;

	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver, SearchProduct.class);
	}

	public static WebElement getSelect(WebElement element) {
		return select;

	}

}
