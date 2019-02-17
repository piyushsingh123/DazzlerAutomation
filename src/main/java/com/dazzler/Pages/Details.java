package com.dazzler.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.dazzler.base.Common;

public class Details extends DetailLocator
{
	WebDriver driver;
	
	public Details(WebDriver driver)
	{
	   this.driver = driver;	
	}
	public void fill(String a,String b,String c,String d,String e,String f,String g,String h) throws InterruptedException
	{
		Select src= new Select(Common.getElement(driver,FROM_PLACE));
		src.selectByVisibleText(a);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select fromMonth= new Select(Common.getElement(driver,FROM_MONTH));
		fromMonth.selectByVisibleText(b);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select fromDay= new Select(Common.getElement(driver,FROM_DAY));
		fromDay.selectByVisibleText(c);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select dst= new Select(Common.getElement(driver,TO_PLACE));
		dst.selectByVisibleText(d);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select toMonth= new Select(Common.getElement(driver,TO_MONTH));
		toMonth.selectByVisibleText(e);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select toDay= new Select(Common.getElement(driver,TO_DAY));
		toDay.selectByVisibleText(f);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select count= new Select(Common.getElement(driver,PASS));
		count.selectByValue(g);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select airline= new Select(Common.getElement(driver,AIRLINE));
		airline.selectByVisibleText(h);
	}
}
