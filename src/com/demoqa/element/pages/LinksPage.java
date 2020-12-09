package com.demoqa.element.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class LinksPage extends BaseTest{
	@FindBy(xpath="//a[.='Home']") private WebElement homelink;
	public WebElement gethomelink()
	{
		return homelink;
	}
	public void clickhomelink()
	{
		homelink.click();
	}
	
	@FindBy(id="dynamicLink") private WebElement homezlink;
	public WebElement gethomezlink()
	{
		return homezlink;
	}
    public void clickhomezlink()
    {
    	homezlink.click();
    }
    
    @FindBy(xpath="//div[@class='main-header']") private WebElement linksheading;
	public WebElement getbuttonhead()
	{
		return linksheading;
		
	}
    
      public void LinksTest() throws Throwable {
    	
    	FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(linksheading,"Links"),flib.getPropKeyValue(PROPERTY_PATH, "linksTitle"),"LinksPage");
    	
    }
      public LinksPage()
      {
    	  PageFactory.initElements(driver, this);
      }
    
    
    
}
