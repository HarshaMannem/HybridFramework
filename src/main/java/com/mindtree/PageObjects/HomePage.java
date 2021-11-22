package com.mindtree.PageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.mindtree.UiStore.HomePageUI;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	public void click_on_sign_in()
	{
		driver.findElement(HomePageUI.signin).click();;
	}
	public void click_on_wishlist()
	{
		driver.findElement(HomePageUI.wishlist).click();
	}
	public void click_on_cart()
	{
		driver.findElement(HomePageUI.cart);
	}
	public void search_for_product_in_searchbar(String itemname)
	{
		driver.findElement(HomePageUI.search_box).sendKeys(itemname);
		driver.findElement(HomePageUI.search_box).sendKeys(Keys.ENTER);
	}
	public void click_on_personalisedgifts()
	{
		driver.findElement(HomePageUI.personalgifts).click();
	}
	public void click_on_homedecor()
	{
		driver.findElement(HomePageUI.homedecor).click();
	}
	public String search_result_validation(String prodname)
	{
        String res=null;
		List<WebElement> allLinks = driver.findElements(HomePageUI.search_result);
		Iterator<WebElement> iterator = allLinks.iterator();
		while (iterator.hasNext()) {
		String itemname = iterator.next().getText();
			
			if(itemname.equalsIgnoreCase(prodname))
			{
			    res=itemname;
				break;
			}
		}
		return res;
		
	}
	public void click_on_Top50()
	{
		driver.findElement(HomePageUI.top).click();
	}
    public void navigate_to_geekgifts_via_shopBycategory()
    {
    	Actions a=new Actions(driver);
    	WebElement ele=driver.findElement(HomePageUI.shop_by_category);
    	WebElement ele1=driver.findElement(HomePageUI.shop_by_persons);
    	WebElement ele2=driver.findElement(HomePageUI.geekgifts);
    	a.moveToElement(ele).pause(800).moveToElement(ele1).pause(800).moveToElement(ele2).click().build().perform();
    }
    public void click_on_giftforboys_from_dropdownGifts()
    {
    	Actions a=new Actions(driver);
    	WebElement ele=driver.findElement(HomePageUI.Gifts);
    	WebElement ele1=driver.findElement(HomePageUI.giftsforboys);
    	a.moveToElement(ele).pause(800).moveToElement(ele1).click().build().perform();
    	
    }
    public void click_on_Allofit()
    {
    	driver.findElement(HomePageUI.Allofit).click();
    }
    public void sign_up_for_now(String mail)
    {
    	driver.findElement(HomePageUI.signupfornow_mailbox).sendKeys(mail);
		driver.findElement(HomePageUI.sigupfornow).click();
    }
    public void click_on_giftcard()
    {
    	 driver.findElement(HomePageUI.giftcard).click();
 	   
    }
    public void click_on_add_giftcard_to_cart()
    {
    	 driver.findElement(HomePageUI.addtoCart).click();
    }
  

}
