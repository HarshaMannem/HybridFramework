package com.mindtree.Runner;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;

public class Adding_GiftCard_to_Cart extends Base{
	@Test
	public void add_giftcard_to_cart()
	{
		homepage.click_on_giftcard();
		logger.info("clicked on giftcard in HomePageUi");
		homepage.click_on_add_giftcard_to_cart();
		logger.info("clicked on the add to cart to add giftcard to the cart");
	}

}
