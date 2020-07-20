package com.qa.ebay.pageobjects;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.ebay.base.TestBase;

public class ResultPage extends TestBase{


	@FindBy(xpath ="//a//h3[@class='s-item__title s-item__title--has-tags']")
	List<WebElement> selectProduct;
	

	
	public ResultPage() {
		PageFactory.initElements(driver, this);
	}

	public String resultPageTitle() {
		return driver.getTitle();
	}
	
	public PurchasePage clickProduct() {

		selectProduct.get(0).click();
		return new PurchasePage();
	        
	}
	

	
	}


