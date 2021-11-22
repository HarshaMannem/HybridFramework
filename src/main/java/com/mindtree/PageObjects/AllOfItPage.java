package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.UiStore.AllOfItUi;

public class AllOfItPage {
	public WebDriver driver;
	public AllOfItPage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	
	public void click_on_prod()
	{
		driver.findElement(AllOfItUi.product_name).click();
	}
	public void click_on_addTocart()
	{
		driver.findElement(AllOfItUi.add_to_cart).click();
	}

}
