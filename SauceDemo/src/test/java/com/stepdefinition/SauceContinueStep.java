package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceContinuePage;
import com.pages.SauceLoginPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceContinueStep extends Library{
	SauceLoginPage login;
	SauceContinuePage cp;
	Utility util;
	Logger logger=LogManager.getLogger(SauceContinueStep.class.getName());



@Given("^User launch chrome browser$")
public void user_launch_chrome_browser() throws Throwable {
	launchApplication();
    }

@When("^Page is Opened$")
public void page_is_Opened() throws Throwable {
	login =new SauceLoginPage(driver);
	login.loginToApp_username("standard_user");
	login.loginToApp_password("secret_sauce");
	login.loginToApp_Loginbtn();
	logger.info("clicked on login button");
	Thread.sleep(2000);
    }

@Then("^Add item to cart$")
public void add_item_to_cart() throws Throwable {
	cp=new SauceContinuePage(driver);
	cp.select();
	logger.info("item is added to cart");
	Thread.sleep(2000);
	cp.Cart();
    
}

@Then("^Continue shopping$")
public void continue_shopping() throws Throwable {
	cp.Continue();
	util=new Utility(driver);
	util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\continue.png");
	
	Thread.sleep(2000);

   }

@Then("^Select another item$")
public void select_another_item() throws Throwable {
	cp.select1();
    Thread.sleep(2000);
    cp.Cart();

    }

@Then("^Close the browser$")
public void close_the_browser() throws Throwable {
	driver.close();
    
}


}
