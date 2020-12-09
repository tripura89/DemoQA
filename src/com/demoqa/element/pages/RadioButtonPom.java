package com.demoqa.element.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class RadioButtonPom extends BaseTest{
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]") private WebElement yesradiobtn;
	//@FindBy(xpath="//div[@class='custom-control custom-radio custom-control-inline']//label)[1]") private WebElement yesradiobtn;
	public WebElement getyesradiobtn()
	{
		return yesradiobtn;
	}
	public void clickyesradiobtn()
	{
		yesradiobtn.click();
	}
			
	@FindBy(xpath="//div//label[.='Impressive']/..") private WebElement impressiveradiobtn;
	//@FindBy(xpath="//div[@class='custom-control custom-radio custom-control-inline']//input[@id='impressiveRadio']") private WebElement impressiveradiobtn;		
	public WebElement getimpressiveradiobtn()
	{
		return impressiveradiobtn;
	}
			
	public void clickimpressiveradiobtn()
	{
		impressiveradiobtn.click();
	}
			
	 @FindBy(xpath="//div[.='Radio Button'and @class='main-header']")private WebElement radiobuttonheading;
     public WebElement getradioboxheading()
     {
    	 return radiobuttonheading;
     }
     public void radioButtonTest() throws Throwable
     {
    	FileLib flib=new FileLib();
     	WebDriverCommonLib wlib=new WebDriverCommonLib();
     	wlib.verifyPage(wlib.waitForElementVisibility(radiobuttonheading,"Radio Button"),flib.getPropKeyValue(PROPERTY_PATH, "radiobuttonTitle"),"RadioButtonPage");
     }	
     
     public void radioButtonClick() throws InterruptedException {
    	 
    		yesradiobtn.click();
    		Thread.sleep(2000);
    		impressiveradiobtn.click();
    		Thread.sleep(2000);
    		yesradiobtn.click();
     }
     
    
    	 
    	 
     
    /* public void radioButtonNoClick()
     {
    	 noradiobtn.click();
     }*/
			
	public RadioButtonPom()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath="//div[@class='custom-control custom-radio custom-control-inline']//input[@id='noRadio']") private WebElement noradiobtn;
	public WebElement getnoradiobtn() {
		return noradiobtn;
	}
	public void clicknoradiobtn()
	{
	   JavaScriptExecutor jse = (JavaScriptExecutor)driver;
	   //jse.executescript("document.getElementById('noRadio')).value='noradiobtn'");
	}*/
	
}
