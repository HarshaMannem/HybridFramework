package com.mindtree.ReusableComponents;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mindtree.PageObjects.AllOfItPage;
import com.mindtree.PageObjects.CreateAccount;
import com.mindtree.PageObjects.HomePage;
import com.mindtree.PageObjects.HomedecorPage;
import com.mindtree.PageObjects.KeyChainPage;
import com.mindtree.PageObjects.LoginPage;
import com.mindtree.PageObjects.PersonalizedGiftsPage;
import com.mindtree.PageObjects.Top50Page;
import com.mindtree.Utilities.ConfigProperty;
import com.mindtree.Utilities.ExcelDriver;
import com.mindtree.Utilities.ExtentFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Base {
	public static WebDriver driver;
	public static Logger logger=Logger.getLogger(Base.class.getName());
	public  static Properties prop;
	public  static ExtentTest test;
	public static  ExtentReports report;
	public static CreateAccount create;
	public static HomePage homepage;
	public static LoginPage login;
	public static PersonalizedGiftsPage pergiftspage;
	public static Top50Page toppage;
	public static KeyChainPage key;
	public static HomedecorPage hdecor;
	public static AllOfItPage all;
	
	
	
	@BeforeSuite
	public  void beforeClass()
	{   
		
		report=ExtentFactory.getInstance();
		test=report.startTest("TestReport");
	}

    @BeforeClass
    public void DriverSetup() throws IOException 
    {   
 
    	String browsername=ConfigProperty.getBrowsername();
    	String path=ConfigProperty.driverpath();
    	driver=DriverInitalisation.intializedriver(driver,browsername,logger,path);
    	logger.info("Passing the driver object to all the PageObjects");
    	homepage=new HomePage(driver);
    	login=new LoginPage(driver);
    	pergiftspage=new PersonalizedGiftsPage(driver);
        toppage=new Top50Page(driver);
        create=new CreateAccount(driver);
        key=new KeyChainPage(driver);
        hdecor=new HomedecorPage(driver);
        all=new AllOfItPage(driver);
    	
    }
    
    @BeforeMethod
    public void beforeMethod() throws IOException
    {
    	logger.info("Opening url");
    	String url=ConfigProperty.getUrl();
		driver.get(url);
		logger.info("Url opened");
		ExcelDriver.WorkBookSetup();
		logger.info("Excel WorkBook Setup is done");
    }
    @AfterClass
	 public void afterClass()
	 {  
    	
    	driver.quit();
    	logger.info("Driver Closed");

    } 
	
	 @AfterSuite
		public void afterSuite()
		{
			report.endTest(test);
			report.flush();	
		}
	
	    
	    
 

}
