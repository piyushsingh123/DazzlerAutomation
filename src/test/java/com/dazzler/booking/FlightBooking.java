package com.dazzler.booking;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.dazzler.Pages.Book;
import com.dazzler.Pages.Details;
import com.dazzler.Pages.Login;
import com.dazzler.base.BaseClass;
import com.dazzler.util.Prop;
import com.dazzler.util.XMLReader;

//@Listeners(Listener.class)
public class FlightBooking
{
	
	public WebDriver driver=null;
	Login l;
	Book b;
	Details e;
	HashMap<String,String> m = Prop.getProperty("/src/main/java/config/config.properties");
	HashMap<String,String> d = XMLReader.getTestData("/Flightdata.xml");
	String userName=d.get("user");
	String password=d.get("password");
	String first=d.get("first");
	String second=d.get("second");
	String mobile=d.get("mobile");
	String src=d.get("src");
	String frommonth=d.get("frommonth");
	String fromday=d.get("fromday");
	String des=d.get("des");
	String tomonth=d.get("tomonth");
	String today=d.get("today");
	String browser=m.get("browser");
	String url=m.get("url");
	String srca=d.get("srcagain");
	String frommontha=d.get("frommonthagain");
	String fromdaya=d.get("fromdayagain");
	String desa=d.get("desagain");
	String tomontha=d.get("tomonthagain");
	String todaya=d.get("todayagain");
	String count=d.get("count");
	String airline=d.get("airline");
	
	@BeforeSuite(alwaysRun = true)
	public void init()
	{
		driver = BaseClass.selectBrowser(browser);
		driver.get(url);
		l = new Login(driver);
		b = new Book(driver);
		e = new Details(driver);
	}
	
	@Test(priority=0,description = "Login",alwaysRun = true)
	public void login() throws InterruptedException
	{
		l.login(userName, password);
		Thread.sleep(500);
	}
	
	@Test(priority=1,description = "First Reservation",dependsOnMethods = {"login"})
	public void travel() throws InterruptedException
	{
		e.fill(src,frommonth,fromday,des,tomonth,today,count,airline);
		Thread.sleep(1000);
	    b.booking(first,second,mobile);
	    Thread.sleep(1000);
	    Reporter.log("First Reservation Done",true);
	    b.back();
	}
	
	@Test(priority=2,description = "Second Reservation",dependsOnMethods = {"travel"})
	public void travelagain() throws InterruptedException
	{
	    e.fill(srca,frommontha,fromdaya,desa,tomontha,todaya,count,airline);
	    Thread.sleep(1000);
	    b.booking(first,second,mobile);
	    Thread.sleep(1000);
	    Reporter.log("Second Reservation Done",true);
	}
	
	@AfterSuite
	public void exit()
	{
		driver.close();
	}
}
