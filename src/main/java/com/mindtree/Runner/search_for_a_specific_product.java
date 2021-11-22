package com.mindtree.Runner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;

public class search_for_a_specific_product extends Base {
	
	@Test(dataProvider="getData")
	public void search_for_product(String pname)
	{   
		homepage.search_for_product_in_searchbar(pname);
		logger.info("The name of the product is entered in to the search box using data provider ");
		String res=homepage.search_result_validation(pname);
		Assert.assertEquals(res,pname);
		
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]="Batman Rug";
		
		return data;
	}
	
	

}
