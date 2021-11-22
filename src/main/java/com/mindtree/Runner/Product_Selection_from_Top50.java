package com.mindtree.Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;

public class Product_Selection_from_Top50 extends Base{
	
	@Test
	public void select_product_from_Top50()
	{
		homepage.click_on_Top50();
		logger.info("clicked on the Top50 icon in homepage Ui");
		String prodname=ExcelDriver.getData("Top50Productname");
		String result=toppage.product_search_top50(prodname);
		logger.info("clicked on specific product search in the Top50 products");
		Assert.assertEquals(result,prodname);
	}

}
