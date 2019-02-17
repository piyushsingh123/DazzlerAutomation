package com.dazzler.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.dazzler.base.Common;

public class Book extends BookLocator
{
	WebDriver driver;
	
	public Book(WebDriver driver)
	{
	   this.driver = driver;	
	}
	public void booking(String f,String l,String m) throws InterruptedException
	{
		Common.getElement(driver,FIND_FLIGHT).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,OUT_FLIGHT).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,IN_FLIGHT).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,RES_FLIGHT).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,F_NAME).sendKeys(f);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,L_NAME).sendKeys(l);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,MOBILE).sendKeys(m);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,BUY).click();
		
	}
	public void back()
	{
		Common.getElement(driver, BACK).click();
	}
	public String confirm()
	{
		return Common.getElement(driver, BOOKED).getText().trim();	
	}
}
