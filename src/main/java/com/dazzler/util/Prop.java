package com.dazzler.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Prop 
{

	static HashMap<String,String> hm = new HashMap<String, String>();
	
	public static HashMap<String, String> getProperty(String path)
	{
		Properties prop = new Properties();
		InputStream input = null;
		try 
		{
			input = new FileInputStream(System.getProperty("user.dir")+path);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			prop.load(input);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> propName = prop.stringPropertyNames();
		Iterator<String> it = propName.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			hm.put(key, prop.getProperty(key));
		}
		return hm;
	}

}
