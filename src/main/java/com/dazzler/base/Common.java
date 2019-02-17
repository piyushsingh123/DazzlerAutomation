package com.dazzler.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common 
{

	public static WebElement getElement(WebDriver driver,By locator)
	{
		return waitForPresence(driver, locator);
	}
	
	public static WebElement waitForPresence(WebDriver driver,By locator)
	{
		WebElement element = null;
		try
		{
			element = (new WebDriverWait(driver, 5000))
					.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}

}
