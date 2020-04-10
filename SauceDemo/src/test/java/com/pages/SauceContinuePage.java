package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceContinuePage {
	WebDriver driver;
	
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement item;
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement cart;
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/a[1]")
	WebElement con;
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[5]/div[3]/button")
	WebElement item1;
	public SauceContinuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		this.driver=driver;
	}
	//to select an item
	public void select() {
		
		item.click();
		
	}
	//to go into cart
	public void Cart() {
		
		cart.click();	
	}
	//to click on continue shopping
	public void Continue() {
		
		con.click();	
	}
	//to select another item
	public void select1() {
		item1.click();
		
	}

}
