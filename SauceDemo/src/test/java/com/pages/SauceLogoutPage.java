package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogoutPage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/div/button")
	WebElement option;
	@FindBy(xpath="/html/body/div/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logout;
	public SauceLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		this.driver=driver;
	}
	//select menu option
	public void select() {
		(option).click();
		
	}
	//to click on logout
	public void Logout() {
		(logout).click();
		
	}



}
