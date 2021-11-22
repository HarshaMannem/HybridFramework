package com.mindtree.PageObjects;


import org.openqa.selenium.WebDriver;

import com.mindtree.UiStore.CreateAccountUI;

public class CreateAccount {
    
	public WebDriver driver;
	public CreateAccount(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	public void enter_first_name(String firstName)
	{
		driver.findElement(CreateAccountUI.firstname).sendKeys(firstName);
	}
	public void enter_last_name(String lastName)
	{
		driver.findElement(CreateAccountUI.lastname).sendKeys(lastName);
	}
	public void enter_mailID(String mail)
	{
		driver.findElement(CreateAccountUI.mailid).sendKeys(mail);
	}
	public void enter_Password(String password)
	{
		driver.findElement(CreateAccountUI.createpassword).sendKeys(password);
	}
	public void create_account()
	{
		driver.findElement(CreateAccountUI.createaccount).click();
	}
	
	
}
