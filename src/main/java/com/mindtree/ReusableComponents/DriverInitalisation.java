package com.mindtree.ReusableComponents;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitalisation {
	public static WebDriver driver;
	

	public static WebDriver intializedriver(WebDriver driver,String browser,Logger logger,String driverpath) 
	{   
		
		logger.info("Driver Setup");
		if(browser.equals("chrome"))
		{   
			logger.info("Google browser");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +driverpath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			logger.info("Initialization of Driver is done");
			
		
		}
		else if(browser.equals("firefox"))
		{   
			logger.info("Firefox browser");
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ driverpath);
			driver=new FirefoxDriver();
			logger.info("Initialization of Driver");
			
		}
		else if(browser.equals("edge"))
		{
			logger.info("Edge browser");
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+driverpath);
			driver=new EdgeDriver();
			logger.info("Initialization of Driver");
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}	

}
