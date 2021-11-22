package com.mindtree.PageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UiStore.KeyChainUI;

public class KeyChainPage {

	public WebDriver driver;

	public KeyChainPage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	

	public boolean search_for_keychain(String keychainname)
	{
		List<WebElement> allLinks = driver.findElements(KeyChainUI.keychain);
		int c=0;
		Iterator<WebElement> iterator = allLinks.iterator();
		while (iterator.hasNext()) {
			String keyname = iterator.next().getText();

			if(keyname.equalsIgnoreCase(keychainname))
			{
				c=c+1;
				break;
			}

		}
		if(c==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
