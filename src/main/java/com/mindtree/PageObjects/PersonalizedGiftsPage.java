package com.mindtree.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.UiStore.PersonalizedGiftsUI;

public class PersonalizedGiftsPage {
 
	public WebDriver driver;

	public PersonalizedGiftsPage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	
	public void click_on_sortBy()
	{
		driver.findElement(PersonalizedGiftsUI.sortby).click();
	}
	public void select_new_from_dropdown()
	{
		Select dropdown=new Select(driver.findElement(PersonalizedGiftsUI.sortby));
		dropdown.selectByVisibleText("New");
	}
	public void select_a_product()
	{
		driver.findElement(PersonalizedGiftsUI.newproduct).click();
	}
	public void enter_customer_name(String username)
	{
		driver.findElement(PersonalizedGiftsUI.usernamebox).click();
		driver.findElement(PersonalizedGiftsUI.usernamebox).sendKeys(username);
		driver.findElement(PersonalizedGiftsUI.usernamebox).sendKeys(Keys.ENTER);
	}
	public void add_to_cart()
	{
		driver.findElement(PersonalizedGiftsUI.add_to_cart).click();
	}
	
}