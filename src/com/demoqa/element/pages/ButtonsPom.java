package com.demoqa.element.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ButtonsPom extends BaseTest{
	
	@FindBy(xpath="//button[@id='doubleClickBtn']") private WebElement doubleclickbtn;
	public WebElement getdoubleclickbtn()
	{
		return doubleclickbtn;
	}
    public void clickdoubleclickbtn()
    {
    
		Actions ac=new Actions(driver);
		ac.moveToElement(doubleclickbtn).perform();
		ac.doubleClick(doubleclickbtn).perform();
    }
    @FindBy(xpath="//button[@id='rightClickBtn']")private WebElement rightclickbtn;
    public WebElement getrightclickbtn()
    {
    	return rightclickbtn;
    }
    
    public void clickrightclickbtn()
    {
    	Actions ac=new Actions(driver);
		ac.contextClick(rightclickbtn).perform();
    }
    
    @FindBy(xpath="//button[.='Click Me']")private WebElement clickmebtn;
	public WebElement getclikBtn()
	{
		return clickmebtn;
		
	}
	public void clickclickmecbtn()
	{
		clickmebtn.click();
	}
	
	@FindBy(xpath="//div[@class='main-header']") private WebElement buttonheading;
	public WebElement getbuttonhead()
	{
		return buttonheading;
		
	}
	
	public void buttonsTest() throws Throwable {
		
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(buttonheading,"Buttons"),flib.getPropKeyValue(PROPERTY_PATH, "buttonsTitle"),"ButtonsPage");
    	
		
	}
	
	
	public void buttonactions() throws InterruptedException
	{
		
		Actions ac=new Actions(driver);
		//doubleclickbtn
		ac.moveToElement(doubleclickbtn).perform();
		ac.doubleClick(doubleclickbtn).perform();
		Thread.sleep(3000);
		//rightclick
		ac.contextClick(rightclickbtn).perform();
		//clickme
		Thread.sleep(3000);
		clickmebtn.click();
		
	}
	
	
	
	
	public ButtonsPom()
	{
		PageFactory.initElements(driver, this);
	}
    
    
}
