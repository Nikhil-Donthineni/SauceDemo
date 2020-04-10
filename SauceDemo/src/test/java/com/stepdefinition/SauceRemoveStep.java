package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceLoginPage;
import com.pages.SauceRemovePage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceRemoveStep extends Library{
	SauceLoginPage login;
	SauceRemovePage rp;
	Utility util;
	Logger logger=LogManager.getLogger(SauceRemoveStep.class.getName());

	@Given("^User launches the  Chrome Browser$")
	public void user_launches_the_Chrome_Browser() throws Throwable {
		launchApplication();
		logger.info("application launched");
	    	}

	@When("^Web Page is opened$")
	public void web_Page_is_opened() throws Throwable {
		login =new SauceLoginPage(driver);
		login.loginToApp_username("standard_user");
		login.loginToApp_password("secret_sauce");
		login.loginToApp_Loginbtn();
		logger.info("login button is clicked");

		Thread.sleep(2000);
	    	}

	@Then("^Select the items$")
	public void select_the_items() throws Throwable {
		rp=new SauceRemovePage(driver);
		rp.select();
		logger.info("item is selected");
		Thread.sleep(2000);
	    	}

	@Then("^Go to cart$")
	public void go_to_cart() throws Throwable {
		rp.Cart();
		Thread.sleep(2000);
	   	}

	@Then("^Remove the items$")
	public void remove_the_items() throws Throwable {
		rp.delete();
		logger.info("item is removed");
		util=new Utility(driver);
		util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\remove.png");
	    	}

	@Then("^Close the page$")
	public void close_the_page() throws Throwable {
		driver.close();
	    
	}


}
