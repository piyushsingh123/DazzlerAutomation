package com.dazzler.Pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.dazzler.util.XMLReader;

public class DetailLocator 
{
	static HashMap<String,String> b = XMLReader.getTestData("/Flightdata.xml");
	static String type= b.get("type");
	static String serv= b.get("service");
	
	public static final By FROM_PLACE = By.name("fromPort");
	public static final By FROM_MONTH = By.name("fromMonth");
	public static final By FROM_DAY = By.name("fromDay");
	public static final By TO_PLACE = By.name("toPort");
	public static final By TO_MONTH = By.name("toMonth");
	public static final By TO_DAY = By.name("toDay");
	public static final By PASS = By.name("passCount");
	public static final By TYPE = By.xpath("//input[@name='tripType'][@value='"+type+"']");
	public static final By SERVICE = By.xpath("//input[@name='servClass'][@value='"+serv+"']");
	public static final By AIRLINE = By.name("airline");
}
