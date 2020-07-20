package com.qa.ebay.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ebay.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name = "_nkw")
	WebElement txtsearch;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String homePageTitle() {
		return driver.getTitle();
	}
	
	public ResultPage searchProduct(String srch) {
		txtsearch.sendKeys(srch);
		searchBtn.click();
		return new ResultPage();
		
		
	}
	
	
	
	
}
