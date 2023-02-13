package com.sdet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScriptTest extends BaseClass{
	//WebDriver driver;
	
	@Test(description="This TC will verify the title")
	public void verifyTitle_FailTest1() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery Lifestyle, Books & More. Best Offers!";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle );
		//Thread.sleep(5000);
		
	}
	@Test(description="This TC will fill the fields")
	public void login()
	{
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[contains(@class,\"_2IX_2- VJZDxU\")]")).sendKeys("motorolaphones@gmail.com");
    driver.findElement(By.xpath("//button[contains(text(),\"Request OTP\")]")).click();
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[contains(@class,\"_2IX_2- VJZDxU\")]")).sendKeys("9865472314");
	}
	
	

}
