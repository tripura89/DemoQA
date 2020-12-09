package com.alerts.frames.windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class FramesPage extends BaseTest{
	@FindBy(xpath="//iframe[@id='frame1']") private WebElement firstframe;
	public WebElement getfirstframe()
	{
		return firstframe;
	}
	public void setfirstframe()
	{
		System.out.println("This is first frame in framespage");
	}
	
	@FindBy(xpath="//iframe[@id='frame2']") private WebElement secondframe;
	public WebElement getsecondframe()
	{
		return secondframe;
	}
	public void setsecondframe()
	{
		driver.switchTo().frame("frame2");
		System.out.println("switched to frame2");
	}
	
	@FindBy(xpath="//div[.='Frames'and @class='main-header']") private WebElement framesheading;
	public WebElement getframesheading()
	{
		return framesheading;
	}
	
	
	 public void FramesTest() throws Throwable {
			
			FileLib flib=new FileLib();
	    	WebDriverCommonLib wlib=new WebDriverCommonLib();
	    	wlib.verifyPage(wlib.waitForElementVisibility(framesheading,"Frames"),flib.getPropKeyValue(PROPERTY_PATH, "framesTitle"),"FramesPage");	
		}
	
	
	public FramesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
