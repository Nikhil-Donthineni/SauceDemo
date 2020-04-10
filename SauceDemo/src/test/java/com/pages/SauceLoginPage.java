package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	WebDriver driver;
	
	
	@FindBy(id="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div/form/input[3]")
	WebElement login;
	
	public SauceLoginPage(WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
		   this.driver = driver;
		}
	    //to write user name
		public void loginToApp_username(String userid)
		{
			Username.sendKeys(userid);	
			
		}
		//to enter password
		public void loginToApp_password(String pass)
		{
			Password.sendKeys(pass);
			
		}
		//to click on login
		public void loginToApp_Loginbtn()
		{
			login.click();
			
		}


}
