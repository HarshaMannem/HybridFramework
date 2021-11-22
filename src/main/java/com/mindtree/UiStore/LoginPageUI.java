package com.mindtree.UiStore;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	//Locator of the elements in the LOGINPAGE
	
	public static By email=By.xpath("//input[@name='customer[email]']");
	
	public static By password=By.xpath("//input[@id='CustomerPassword']");
	
	public static By submit_signin=By.xpath("//input[@value='Sign In']");
	
	public static By createaccount=By.xpath("//*[@id='customer_register_link']");
	
	public static By sign_using_fb=By.xpath("//*[@class='social_login facebook']");
	
	public static By sign_using_google=By.xpath("//*[@class='social_login google']");
	
	
}
