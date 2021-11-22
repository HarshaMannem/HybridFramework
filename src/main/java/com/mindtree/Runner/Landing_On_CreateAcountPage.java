package com.mindtree.Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;

public class Landing_On_CreateAcountPage extends Base{
	@Test
	public void navigate_to_createAccountPage()
	{
		homepage.click_on_sign_in();
		logger.info("clicked on the sign in");
		login.click_on_CreateAccount();
		logger.info("clicked on create account button");
		String currpgtitle=driver.getTitle();
		String expectedtitle=ExcelDriver.getData("CreateAccPageTitle");
		if(currpgtitle.equals(expectedtitle))
		{
			logger.info("The Create Account Page is landed successfully");
			Assert.assertEquals(currpgtitle,expectedtitle);	
		}
		else
		{
			logger.info("Create Account Page is not landed");
			Assert.assertEquals(currpgtitle,expectedtitle);
		}
	}

}
