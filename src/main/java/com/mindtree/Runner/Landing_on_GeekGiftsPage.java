package com.mindtree.Runner;

import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;

public class Landing_on_GeekGiftsPage extends Base{
	@Test
	public void Navigating_to_GeekGiftsPage() throws InterruptedException
	{
		homepage.navigate_to_geekgifts_via_shopBycategory();
		logger.info("Navigated to the Geeks gifts page via shop by catergory");
		Thread.sleep(1500);
	}

}
