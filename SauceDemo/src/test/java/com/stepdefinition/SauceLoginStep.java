package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceLoginPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SauceLoginStep extends Library {
	Utility util;
	SauceLoginPage login;
	Logger logger=LogManager.getLogger(SauceLoginStep.class.getName());


@Given("^User  launch Chrome browser$")
public void user_launch_Chrome_browser() throws Throwable {
	launchApplication();
    
}

@When("^Login Saucedemo page opened$")
public void login_Saucedemo_page_opened() throws Throwable {
	util=new Utility(driver);
	util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\login.png");

    }

@When("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void user_enters_email_as_and_password_as(String username, String password) throws Throwable {
	login=new SauceLoginPage(driver);
    login.loginToApp_username(username);
    login.loginToApp_password(password);
    logger.info("user name and password is entered");
    System.out.println("credentials are passed");
   }

@When("^Click on Login$")
public void click_on_Login() throws Throwable {
	login.loginToApp_Loginbtn();
	logger.info("clicked on login button");
    }

@When("^Close Browser$")
public void close_Browser() throws Throwable {
	driver.close();
    
}


}
