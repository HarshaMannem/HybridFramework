package com.mindtree.PageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.mindtree.UiStore.Top50PageUI;

public class Top50Page {
	public WebDriver driver;

	public Top50Page(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}

	public String product_search_top50(String productName)
	{   
		
		String result=null;
		List<WebElement> allproducts = driver.findElements(Top50PageUI.titles);
		Iterator<WebElement> iterator = allproducts.iterator();
		while (iterator.hasNext()) {
			String producttitle = iterator.next().getText();

			if(producttitle.equalsIgnoreCase(productName))
			{
				result=producttitle;
				break;
			}
		}
		return result;
	}



}
