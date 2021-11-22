package com.mindtree.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {
	public  static Properties prop;
	public static String getBrowsername() throws IOException
	{   
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Selenium_New\\HARSHA\\eclipse-workspace\\HybridFramework\\src\\main\\resources\\config.properties");
		prop.load(fis);
		String name=prop.getProperty("browser");
	
		return name;
	}
	public static String getUrl()
	{   
	
		String urlname=prop.getProperty("url");
		return urlname;
	}
	public static String getExcelpath()
	{
		String path=prop.getProperty("excelpath");
		return path;
	}
	public static String driverpath()
	{
		String dpath=prop.getProperty("driverpath");
		return dpath;
	}
	
}
