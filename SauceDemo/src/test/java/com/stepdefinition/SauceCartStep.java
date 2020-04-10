package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceCartPage;
import com.pages.SauceLoginPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceCartStep extends Library{
	SauceLoginPage login;
	SauceCartPage cp;
	Utility util;
	Logger logger=LogManager.getLogger(SauceCartStep.class.getName());

	
	@Given("^User launch Chrome Browser$")
	public void user_launch_Chrome_Browser() throws Throwable {
		launchApplication();
	    
	}

	@When("^Page is opened$")
	public void page_is_opened() throws Throwable {
		login =new SauceLoginPage(driver);
		login.loginToApp_username("standard_user");
		login.loginToApp_password("secret_sauce");
		login.loginToApp_Loginbtn();
		logger.info("clicked on login button");
	    Thread.sleep(2000);

	}

	@Then("^Add items to cart$")
	public void add_items_to_cart() throws Throwable {
		cp=new SauceCartPage(driver);
		cp.select();
		logger.info("item is added to cart");
		cp.gotocart();
		Thread.sleep(3000);
		
		util=new Utility(driver);
		util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\cart.png");

	    	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	    	}

}
