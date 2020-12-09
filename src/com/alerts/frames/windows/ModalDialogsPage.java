package com.alerts.frames.windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ModalDialogsPage extends BaseTest{
	@FindBy(xpath="//button[@id='showSmallModal']") private WebElement smallmodalbtn;
	public WebElement getsmallmodalbtn()
	{
		return smallmodalbtn;
	}
	public void setsmallmodalbtn()
	{
		smallmodalbtn.click();
		System.out.println("This is small modal dialog");
	}
	@FindBy(xpath="//button[@id='showLargeModal']") private WebElement largemodalbtn;
	
	public WebElement getlargemodalbtn()
	{
		return largemodalbtn;
	}
	public void setlargemodalbtn()
	{
		largemodalbtn.click();
		System.out.println("This is large modal dialog");
		
	}
 @FindBy(xpath="//button[@id='closeSmallModal']") private WebElement closesmallmodalbtn;
	
	public WebElement getcloseSmallModal()
	{
		return closesmallmodalbtn;
	}
	public void setclosesmallmodalbtn()
	{
		closesmallmodalbtn.click();
		
	}
	
@FindBy(xpath="//button[@id='closeLargeModal']") private WebElement closelargemodalbtn;
	
	public WebElement getcloselargemodalbtn()
	{
		return closelargemodalbtn;
	}
	public void setcloselargemodalbtn()
	{
		closelargemodalbtn.click();
		
	}
	
	
	
	@FindBy(xpath="//div[.='Modal Dialogs'and @class='main-header']") private WebElement modaldialogsheading;
	public WebElement getnestedframesheading()
	{
		return modaldialogsheading;
	}
	
	
	 public void ModalDialogsTest() throws Throwable {
			
			FileLib flib=new FileLib();
	    	WebDriverCommonLib wlib=new WebDriverCommonLib();
	    	wlib.verifyPage(wlib.waitForElementVisibility(modaldialogsheading,"Modal Dialogs"),flib.getPropKeyValue(PROPERTY_PATH, "modaldialogsTitle"),"ModalDialogsPage");	
		}
	 
	 public ModalDialogsPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
}
