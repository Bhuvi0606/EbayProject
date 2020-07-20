package com.qa.ebay.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ebay.base.TestBase;

public class PurchasePage extends TestBase {
	
	@FindBy(id = "prcIsum")
	WebElement itemPrice;
	
	
	public PurchasePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String purchasePageTilte() {
		 return driver.getTitle();
	  
		
	}
	
	public void price() {
		String text = itemPrice.getText();
		System.out.println("Price------->"+text);
		
	}
	

}
