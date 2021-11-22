package com.mindtree.Runner;

import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;

public class Login_Check extends Base {

	@Test
	public void login_to_site_check()
	{
		homepage.click_on_sign_in();
		logger.info("clicked on the sign in button in the homepage");
		String email=ExcelDriver.getData("Mail");
		login.enter_email(email);
		logger.info("entered the email");
		String password=ExcelDriver.getData("Password");
		login.enter_password(password);
		logger.info("entered the password");
		login.click_on_submit();
		logger.info("clicked on the submit");
	}
}
