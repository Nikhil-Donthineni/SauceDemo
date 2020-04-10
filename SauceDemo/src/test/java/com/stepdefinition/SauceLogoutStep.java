package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceLoginPage;
import com.pages.SauceLogoutPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceLogoutStep extends Library{
	SauceLoginPage login;
	SauceLogoutPage lp;
	Utility util;
	Logger logger=LogManager.getLogger(SauceLogoutStep.class.getName());


	@Given("^To launch Chrome browser$")
	public void to_launch_Chrome_browser() throws Throwable {
		launchApplication();
		
	}

	@When("^Saucedemo is opened$")
	public void saucedemo_is_opened() throws Throwable {
		login =new SauceLoginPage(driver);
		login.loginToApp_username("standard_user");
		login.loginToApp_password("secret_sauce");
		login.loginToApp_Loginbtn();
		logger.info("clicked on login button");
		Thread.sleep(2000);

	}

	@Then("^Select the options$")
	public void select_the_options() throws Throwable {
		lp =new SauceLogoutPage(driver);
		lp.select();
		logger.info("clicked on option");
		Thread.sleep(2000);

	}

	@Then("^Logout from website$")
	public void logout_from_website() throws Throwable {
		lp.Logout();
		logger.info("clicked on logout");
		util=new Utility(driver);
		util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\logout.png");
        driver.close();
	}


}
