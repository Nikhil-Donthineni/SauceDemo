package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	public static WebDriver driver;
	Logger LOG = Logger.getLogger(Library.class.getName());
	public static Properties prop;
	
	public void launchApplication() throws IOException
	{
		FileInputStream fis = new FileInputStream("G:\\maven\\SauceDemo\\src\\test\\resources\\configuration property\\config.property");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		try {
			if(browser.equalsIgnoreCase(" Firefox"))
			{
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.getProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
		}
		catch(WebDriverException e)
				{
			System.out.println("browser couldnot launch");
				}
	}
		
		public void quit()
		{
			driver.close();
		}
}
