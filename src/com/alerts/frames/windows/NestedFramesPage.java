package com.alerts.frames.windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class NestedFramesPage extends BaseTest{
	
	@FindBy(xpath="//iframe[@id='frame1']") private WebElement nested1stframe;
	public WebElement getnested1stframe()
	{
		return nested1stframe;
	}
	public void setnested1stframe()
	{
		driver.switchTo().frame("frame1");
		System.out.println("This is parent frame in nested frame");
	}
	
	
	@FindBy(xpath="//iframe") private WebElement nested2ndframe;
	public WebElement getnested2ndframe()
	{
		return nested2ndframe;
	}
	public void setnested2ndframe()
	{
		driver.switchTo().frame(nested2ndframe);
		System.out.println("This is child frame");
	}
	
	
	
	
	@FindBy(xpath="//div[.='Nested Frames'and @class='main-header']") private WebElement nestedframesheading;
	public WebElement getnestedframesheading()
	{
		return nestedframesheading;
	}
	
	
	 public void NestedFramesTest() throws Throwable {
			
			FileLib flib=new FileLib();
	    	WebDriverCommonLib wlib=new WebDriverCommonLib();
	    	wlib.verifyPage(wlib.waitForElementVisibility(nestedframesheading,"Nested Frames"),flib.getPropKeyValue(PROPERTY_PATH, "nestedframesTitle"),"NestedFramesPage");	
		}
	 
	 public NestedFramesPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	

}
