package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceBuyPage;
import com.pages.SauceLoginPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceBuyStep extends Library{
	SauceLoginPage login;
	SauceBuyPage bp;
	Utility util;
	Logger logger=LogManager.getLogger(SauceBuyStep.class.getName());

	@Given("^Launch Chrome Browser$")
	public void launch_Chrome_Browser() throws Throwable {
		launchApplication();
		logger.info("Browser is launched");
	    }
	@When("^Sauce page is opened$")
	public void sauce_page_is_opened() throws Throwable {
		login =new SauceLoginPage(driver);
		login.loginToApp_username("standard_user");
		login.loginToApp_password("secret_sauce");
		login.loginToApp_Loginbtn();
		logger.info("login button is clicked");
    	Thread.sleep(2000);
    	}
	
	@Then("^Choose the item$")
	public void choose_the_item() throws Throwable {
		bp=new SauceBuyPage(driver);
		bp.select();
		logger.info("item added to cart");

	}

	@Then("^Move to cart$")
	public void move_to_cart() throws Throwable {
		bp.Cart();
		logger.info("moved into cart");
		Thread.sleep(2000);   
	}

	@Then("^Checkout and give firstname as \"([^\"]*)\" and lastname as  \"([^\"]*)\" and zipcode as \"([^\"]*)\"$")
	public void checkout_and_give_firstname_as_and_lastname_as_and_zipcode_as(String fname, String lname, String zip) throws Throwable {
		bp.checkout(fname, lname, zip);
		logger.info("clicked on checkout");
		Thread.sleep(2000);

	}

	@Then("^Complete the process$")
	public void complete_the_process() throws Throwable {
		bp.Finish();
		logger.info("clicked on finish");
		util=new Utility(driver);
		util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\buy.png");
		driver.close();
	}


}
