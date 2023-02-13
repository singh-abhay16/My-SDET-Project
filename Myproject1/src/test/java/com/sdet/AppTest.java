package com.sdet;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0, myapp.userlogin("abc", "abc123"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(1, myapp.userlogin("abc", "abc@123"));
	}
	
}
