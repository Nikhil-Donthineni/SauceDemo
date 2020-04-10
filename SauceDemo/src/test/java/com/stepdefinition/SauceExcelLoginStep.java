package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.excelutility.ExcelUtility;
import com.pages.SauceExcelLoginPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceExcelLoginStep extends Library {
	ExcelUtility excel;
	SauceExcelLoginPage elp;
	Utility util;
	Logger logger=LogManager.getLogger(SauceExcelLoginStep.class.getName());
	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser() throws Throwable {
		launchApplication();
		logger.info("browser is launched");
	    	}

	@When("^SauceDemo page is opened$")
	public void saucedemo_page_is_opened() throws Throwable {
		util= new Utility(driver);
		util.takeSnapShot("G:\\maven\\SauceDemo\\src\\test\\resources\\screenshot\\excel.png");
	    	}

	@Then("^Enter the email and password$")
	public void enter_the_email_and_password() throws Throwable {
		elp=new SauceExcelLoginPage(driver);
		excel=new ExcelUtility();
		elp.loginToApp_username(excel.excel_username(1));
		elp.loginToApp_password(excel.excel_password(1));
		logger.info("username and login credentials are passed");
	   
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		elp.loginToApp_Loginbtn();
		logger.info("clicked on login button");
	    	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
	    
	}


}