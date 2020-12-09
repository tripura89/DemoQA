package com.demoqa.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstants {
	
	public static WebDriver driver;
	
	public void openBrowser() throws Throwable{
		
	   
		FileLib flib=new FileLib();
		String browserValue=flib.getPropKeyValue(PROPERTY_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
		
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
	else {
		System.out.println("please enter proper browser name");
	}
		driver.manage().window().maximize();
		String appUrl=flib.getPropKeyValue(PROPERTY_PATH, "url");
		driver.get(appUrl);
	
		
	}
		
	
	public void closeBrowser()
	{
		driver.quit();
			
			
		}
		
	}
	
	 
	
	
	


