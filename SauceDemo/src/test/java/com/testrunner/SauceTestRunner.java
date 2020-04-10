package com.testrunner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
				    features="src//test//resources//features//", 
					glue= "com.stepdefinition",
					plugin = {"pretty", "html:target/cucumber-html-report",
							             "json:target/cucumber-json-report",
							             "junit:target/cucumber-junit-report",
							             "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
				    tags = {"@tc_1_login,@tc_2_addtocart, @tc_3_ContinueShopping,@tc_4_RemoveItems, @tc_5_Buy,@tc_6_Logout,@tc_7_datadrivenlogin"},
				    monochrome = true		    
				)
public class SauceTestRunner 
{
	@AfterClass
	public static void extentreport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\reports\\extentreport");
		Reporter.setSystemInfo("user",System.getProperty("user.name"));
		Reporter.setSystemInfo("os","Windows");
		Reporter.setTestRunnerOutput("sample test runner output message");
	}





}

