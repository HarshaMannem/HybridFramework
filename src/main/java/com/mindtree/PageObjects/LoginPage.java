package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;

import com.mindtree.UiStore.LoginPageUI;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	public void enter_email(String mail)
	{   
		driver.findElement(LoginPageUI.email).click();
		driver.findElement(LoginPageUI.email).sendKeys(mail);
	}
	public void enter_password(String pass)
	{
		driver.findElement(LoginPageUI.password).sendKeys(pass);
	}
	public void click_on_submit()
	{
		driver.findElement(LoginPageUI.submit_signin).click();
	}
	public void click_on_CreateAccount()
	{
		driver.findElement(LoginPageUI.createaccount).click();
	}
		
	public void click_sign_using_facebook()
	{
		driver.findElement(LoginPageUI.sign_using_fb).click();
	}
	public void click_sign_using_Google()
	{
		driver.findElement(LoginPageUI.sign_using_google).click();
	}

}
