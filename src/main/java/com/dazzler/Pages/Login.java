package com.dazzler.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.dazzler.base.Common;

public class Login extends LoginLocator
{
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
	   this.driver = driver;	
	}
	
	public void login(String userName,String password) throws InterruptedException
	{
		Common.getElement(driver, XPATH_USERNAME).sendKeys(userName);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,XPATH_PASSWORD).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,XPATH_LOGIN).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}

}
