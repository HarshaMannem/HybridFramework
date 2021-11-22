package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.UiStore.HomedecorUI;

public class HomedecorPage {
	public WebDriver driver;
	public  HomedecorPage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	
	public void click_on_a_product()
	{
		driver.findElement(HomedecorUI.prod).click();
	}
	public void click_add_to_wishlist()
	{
		driver.findElement(HomedecorUI.add_to_wishlist).click();
	}

}
