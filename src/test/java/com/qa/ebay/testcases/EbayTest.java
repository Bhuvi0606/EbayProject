package com.qa.ebay.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ebay.base.TestBase;
import com.qa.ebay.pageobjects.HomePage;
import com.qa.ebay.pageobjects.PurchasePage;
import com.qa.ebay.pageobjects.ResultPage;

public class EbayTest extends TestBase{
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		
	}
	
	@Test
	public void verifyTheResult() throws InterruptedException{
		String homePagetitle = homePage.homePageTitle();
		Assert.assertEquals(homePagetitle, "Electronics, Cars, Fashion, Collectibles & More | eBay");
		homePage.searchProduct(prop.getProperty("search"));
		ResultPage resultPage =new ResultPage();
		resultPage.clickProduct();	
		PurchasePage purchasePage = new PurchasePage();
		String purchasePageTilte = purchasePage.purchasePageTilte();
		Assert.assertEquals(purchasePageTilte, "Full Size Black Electric Guitar with Amp, Case and Accessories Pack Beginner | eBay");
		purchasePage.price();
	}
	
	@AfterMethod
	public void close() {
	driver.quit();
	}

}
