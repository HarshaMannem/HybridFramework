package com.mindtree.Runner;

import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;

public class New_Product_from_Personalized_Gifts extends Base {
	
	@Test
	public void adding_new_product_from_personalisedGifts_to_cart()
	{
		homepage.click_on_personalisedgifts();
		logger.info("clicked on the personalized gifts");
		pergiftspage.click_on_sortBy();
		logger.info("clicked on sortby on personalized page Ui");
		pergiftspage.select_new_from_dropdown();
		logger.info("selected the new from the dropdown");
		pergiftspage.select_a_product();
		logger.info("selected a product from new personalized products");
		String customer_name=ExcelDriver.getData("UserName");
		pergiftspage.enter_customer_name(customer_name);
		logger.info("entered the customer name to in to the name box");
		pergiftspage.add_to_cart();
		logger.info("clicked on the add to cart");
	}

}
