package com.dazzler.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

	public void onFinish(ITestContext arg0) 
	{
		 System.out.println("The name of the testcase finished is :"+arg0.getName());
		
	}

	public void onStart(ITestContext arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		 System.out.println("The name of the testcase failed with success percentage is :"+arg0.getName());
	}

	public void onTestFailure(ITestResult arg0) 
	{	
		    System.out.println("The name of the testcase failed is :"+arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) 
	{	
		    System.out.println("The name of the testcase Skipped is :"+arg0.getName());					
	}

	public void onTestStart(ITestResult arg0) 
	{	
		    System.out.println(arg0.getName()+" test case started");					
	}

	public void onTestSuccess(ITestResult arg0) 
	{
		System.out.println("The name of the testcase passed is :"+arg0.getName());
	}
	
}
