package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceBuyPage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement item;
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement cart;
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/a[2]")
	WebElement check;
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")
	WebElement finish;
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/form/div[2]/input")
	WebElement Continue;
	@FindBy(id="first-name")
	WebElement fname;
	@FindBy(id="last-name")
	WebElement lname;
	@FindBy(id="postal-code")
	WebElement zip;
	public SauceBuyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		this.driver =driver;
	}
	//to select an item
	public void select() {
		
		(item).click();
		
	}
	//to go into cart
	public void Cart() {
		(cart).click();
	
	}
	//to click on checkout
	public void checkout(String s1, String s2, String s3) {
		(check).click();
		
		(fname).sendKeys(s1);
		(lname).sendKeys(s2);
		(zip).sendKeys(s3);
		
		(Continue).click();
		
	}
	//to click on finish
	public void Finish() {
	    (finish).click();
	    
	}


}
