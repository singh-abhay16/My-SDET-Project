package com.sdet;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTC_login {
	
	@Test
	public void login_test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle );
        //WebElement textBox = driver.findElement(By.xpath("//input[contains(@title,\"Search for products, brands and more\")]"));
		
       driver.findElement(By.xpath("//input[contains(@class,\"_2IX_2- VJZDxU\")]")).sendKeys("motorolaphones@gmail.com");
       driver.findElement(By.xpath("//button[contains(text(),\"Request OTP\")]")).click();
       
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//input[contains(@class,\"_2IX_2- VJZDxU\")]")).sendKeys("9865472314");
     
     //button[contains(text(),"Request OTP")]
		//
		
		//driver.getTitle();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		
	}
	@Test
	public void Fail_Test2()
	{
		
		
		Assert.assertEquals(true, false);
	}
	

}
