package com.mindtree.Runner;

import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;

public class Account_Creation_Check extends Base {
	
	@Test
	public void new_account_creation() throws InterruptedException
	{
		homepage.click_on_sign_in();
		logger.info("clicked on the sign in in Homepage UI");
		login.click_on_CreateAccount();
		logger.info("click on the create new account in Loginpage UI");
		String fname=ExcelDriver.getData("FirstName");
		create.enter_first_name(fname);
		logger.info("Entered the firstname");
		String lname=ExcelDriver.getData("LastName");
		create.enter_last_name(lname);
		logger.info("Entered the lastname");
		Thread.sleep(1000);
		String email=ExcelDriver.getData("Mail");
		create.enter_mailID(email);
		logger.info("Entered the EmailId");
		Thread.sleep(1000);
		String pwd=ExcelDriver.getData("Password");
		create.enter_Password(pwd);
		logger.info("Entered the Password");
		Thread.sleep(1000);
		create.create_account();
		logger.info("clicked on the submit i.e create account");
	}

}
