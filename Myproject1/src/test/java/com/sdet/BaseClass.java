package com.sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		Reporter.log("------Browser Session started---------",true);
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
		Reporter.log("--------Browser Session ended---------",true);
	}
	

}
