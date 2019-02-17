package com.dazzler.Pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.dazzler.util.XMLReader;


public class BookLocator 
{	
	static HashMap<String,String> a = XMLReader.getTestData("/Flightdata.xml");
	static String in= a.get("valin");
	static String out= a.get("valout");
	
	public static final By FIND_FLIGHT = By.xpath("//input[@name='findFlights']");
	public static final By IN_FLIGHT = By.xpath("//input[@name='inFlight'][@value='"+in+"']");
	public static final By OUT_FLIGHT = By.xpath("//input[@name='outFlight'][@value='"+out+"']");
	public static final By RES_FLIGHT = By.xpath("//input[@name='reserveFlights']");
	public static final By F_NAME = By.xpath("//input[@name='passFirst0']");
	public static final By L_NAME = By.xpath("//input[@name='passLast0']");
	public static final By MOBILE = By.xpath("//input[@name='creditnumber']");
	public static final By BUY = By.xpath("//input[@name='buyFlights']");
	public static final By BACK = By.xpath("//img[@src='/images/forms/backtoflights.gif']");
	public static final By BOOKED = By.xpath("//img[@src='/images/masts/mast_confirmation.gif']");
}
