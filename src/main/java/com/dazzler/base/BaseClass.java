package com.dazzler.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	public static WebDriver selectBrowser(String browser)
	{
		if (browser.equals("firefox") || browser.equals("FIREFOX")) 
		{
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		} 
		
		if (browser.equals("chrome") || browser.equals("CHROME")) 
		{
			System.setProperty("webdriver.chrome.driver","/Users/piyush.singh2/Downloads/chrome/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} 
		return null;
	}
}
