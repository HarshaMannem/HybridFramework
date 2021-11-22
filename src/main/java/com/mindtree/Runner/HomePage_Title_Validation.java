package com.mindtree.Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;


public class HomePage_Title_Validation extends Base{
	
	@Test
	public void Validate_HomePage_title()
	{   
		String title=ExcelDriver.getData("HomepageTitle");
		Assert.assertEquals(title,driver.getTitle());
		logger.info("The HomePage title is matched");
	}

}
