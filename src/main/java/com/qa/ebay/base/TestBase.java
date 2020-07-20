package com.qa.ebay.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.ebay.utils.TestUtils;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Bhuvana_Off\\Task\\Ebay\\src\\main\\java\\com\\qa\\ebay\\config\\config.properties");
					prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		
			System.setProperty("webdriver.chrome.driver", "C:\\Bhuvana_Off\\Task\\Ebay\\driver\\chromedriver.exe");	
			driver = new ChromeDriver(); 
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.navigate().to(prop.getProperty("url"));
	}
}
