package com.mindtree.Runner;

import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Base;
import com.mindtree.Utilities.ExcelDriver;
import com.relevantcodes.extentreports.LogStatus;

public class KeyChain_Search extends Base {
	
	@Test
	public void search_for_keyChain()
	{
		homepage.search_for_product_in_searchbar("key chain");
		logger.info("entered key chain in search barand clicked on enter");
		String keyChainname=ExcelDriver.getData("Keychain");
	    boolean result=key.search_for_keychain(keyChainname);
	    logger.info("Entered the key chain name for search");
	    if(result==true)
	    {
	         test.log(LogStatus.PASS, "The searched keychain is found");
	    }
	    else
	    {   
	         test.log(LogStatus.FAIL, "The searched keychain is not found");
	    }
	}

}
