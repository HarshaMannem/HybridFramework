package com.mindtree.UiStore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	//Locator of the elements in the HOMEPAGE
	
	public static By signin=By.xpath("//span[contains(text(),'sign in')]");
	
	public static By giftcard=By.xpath("//span[contains(text(),'gift card')]");
	
	public static By cart=By.xpath("//*[@class='carticonimage']");
	
	public static By wishlist=By.xpath("//span[contains(text(),'wish list')]");
	
	public static By corporategifts=By.xpath("//a[contains(text(),'Corporate Gifts')]");
	
	public static By chirstgifts=By.xpath("//a[contains(text(),'Christmas Gifts')]");
	
	public static By personalgifts=By.xpath("//a[contains(text(),'Personalized Gifts')]");
	
	public static By santagifts=By.xpath("//a[contains(text(),'Secret Santa Gifts')]");
	
	public static By New=By.xpath("//a[contains(text(),'New')]");
	
	public static By Allofit=By.xpath("//a[contains(text(),'All of it')]");
	
	public static By top=By.xpath("//a[contains(text(),'Top 50')]");
	
	public static By Gifts=By.linkText("Gifts");
	
	public static By giftsforboys=By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[7]/ul/li[1]/a");
	
	public static By search_box=By.xpath("//input[@name='q']");
	
	public static By homedecor=By.xpath("//button[contains(text(),'Home Decor')]");
	
	public static By search_result=By.className("snize-title");
	
	public static By shop_by_category=By.xpath("//a[contains(text(),'Shop by Category')]");
	
	public static By shop_by_persons=By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[9]/ul/li[1]/a");
	
	public static By geekgifts=By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[9]/ul/li[1]/ul/li[4]/a");
	
	public static By signupfornow_mailbox=By.name("EMAIL");
	
	public static By sigupfornow=By.name("commit");
	
	public static By addtoCart=By.name("add");


}
