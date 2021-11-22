package com.mindtree.Runner;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;
public class Sign_up_now_Check extends Base{
	@Test
	public void check_sign_up_for_now()
	{
		String email=ExcelDriver.getData("Mail");
		homepage.sign_up_for_now(email);
		logger.info("Entered the email and clicked on sign up for now");
	}

}
