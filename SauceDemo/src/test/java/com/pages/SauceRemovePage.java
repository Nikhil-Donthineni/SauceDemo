package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceRemovePage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement item;
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement cart;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/button")
	WebElement remove;
	public SauceRemovePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		this.driver=driver;
	}
	//to select an product
	public void select() {
		item.click();
		
	}
	//to move into cart
	public void Cart() {
		cart.click();
		
	}
	//to remove the item
	public void delete() {
		remove.click();
	}

}
