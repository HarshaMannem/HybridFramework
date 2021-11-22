package com.mindtree.Runner;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
public class Adding_product_to_cart_from_AllOfIt extends Base{
	@Test
	public void add_to_cart_from_AllOfIt() throws InterruptedException
	{
		homepage.click_on_Allofit();
		logger.info("clicked on the All Of it in HomePage Ui");
		all.click_on_prod();
		logger.info("clicked on a product in All of it page");
		all.click_on_addTocart();
		logger.info("clicked on the Add to cart");
		Thread.sleep(2000);
	}
	

}
