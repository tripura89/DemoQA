package com.demoqa.element.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class TextBoxPom extends BaseTest{
	
	@FindBy(id="userName")private WebElement untxtbox;
	public WebElement getuntxtbox()
	{
		return untxtbox;
	}
	public void setuntxtbox(String username)
	{
		untxtbox.sendKeys(username);
	}
	@FindBy(id="userEmail")private WebElement usremailtxtbox;
	public WebElement getusremailtxtbox()
	{
		return usremailtxtbox;
	}
    public void setusremailtxtbox(String email)
    {
    	usremailtxtbox.sendKeys(email);
    }
    
    @FindBy(id="currentAddress") private WebElement usrcaddrtbox;
    public WebElement getusrcaddrtxtbox()
    {
    	return usrcaddrtbox;
    }
    public void setusrcaddrtbox(String currentaddress)
    {
    	usrcaddrtbox.sendKeys(currentaddress);
    }
    
    @FindBy(id="permanentAddress") private WebElement usrperaddtxtbox;
    public WebElement getusrperaddtxtbox()
    {
    	return usrperaddtxtbox;
    }
    public void setusrperaddtxtbox(String permanentaddress)
    {
         usrperaddtxtbox.sendKeys(permanentaddress);
         
    }
    
    @FindBy(xpath="//div[.='Text Box'and @class='main-header']") private WebElement textboxHeading;
    public WebElement getlogintextheading()
    {
    	return textboxHeading;
    }
   
    public void testBoxTest() throws Throwable {
    	
    	FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(textboxHeading,"Text Box"),flib.getPropKeyValue(PROPERTY_PATH, "textboxTitle"),"TextBoxPage");
    	
    }
    
   
    public TextBoxPom()
    {
    	PageFactory.initElements(driver, this);
    }
    
	public void eleoftxtbox(String username, String useremail, String currentaddress, String permanentaddress) throws InterruptedException {
		
		untxtbox.sendKeys(username);
		Thread.sleep(2000);
		usremailtxtbox.sendKeys(useremail);
		usrcaddrtbox.sendKeys(currentaddress);
		 usrperaddtxtbox.sendKeys(permanentaddress);
	}
}
