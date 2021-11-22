package com.mindtree.Runner;

import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;

public class Adding_product_to_wishlist extends Base {
	
	@Test
	public void adding_product_to_wishlist() throws InterruptedException
	{
		homepage.click_on_homedecor();
		logger.info("clicked on the homedecor on HomepageUi");
		Thread.sleep(4000);
		hdecor.click_on_a_product();
		logger.info("clicked on the product");
		Thread.sleep(3000);
		hdecor.click_add_to_wishlist();
		logger.info("clicked on the homedecor Add to wishlist");	
		
	}

}
