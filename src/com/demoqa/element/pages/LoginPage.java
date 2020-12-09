package com.demoqa.element.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class LoginPage extends BaseTest{
	@FindBy(id="login")private WebElement loginBtn; 
	public WebElement getloginBtn()
	{
		return loginBtn;
	}
	public void clickloginBtn()
	{
		loginBtn.click();
	}

	@FindBy(id="userName") private WebElement usernametbox;
	public WebElement getusernametbox()
	{
		return usernametbox;
	}
	public void setusernametbox(String un) 
	{
		usernametbox.sendKeys("tripura63");
   }
	
	@FindBy(id="password") private WebElement passwordtbox;
    public WebElement getpasswordtbox()
    {
    	return passwordtbox;
    }
    public void setpasswordtbox(String pwd)
    {
    	passwordtbox.sendKeys("Wonderful@2021");
    }
    
    @FindBy(id="login") private WebElement confirmloginBtn;
    public WebElement getconfirmloginBtn()
    {
    	return confirmloginBtn;
    }
	public void clickconfirmloginBtn() {
		
		confirmloginBtn.click();
	}
	
	@FindBy(xpath="//div[@class='pattern-backgound playgound-header']//div[.='Login']") private WebElement loginHeading;
	public WebElement getloginHeading()
	{
		return loginHeading;
	}
	/*public void setloginHeading()
	{
	 if u want to return anything only we can write in set method if nothing has to been written no need of that	
	}*/
		
	public void login(String un,String pwd) throws Throwable
	{
		loginBtn.click();
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verifyPage(wlib.waitForElementVisibility(loginHeading,"Login"),flib.getPropKeyValue(PROPERTY_PATH, "loginTitle"),"LoginPage");
		Thread.sleep(2000);
		usernametbox.sendKeys("tripura63");
		Thread.sleep(2000);
		passwordtbox.sendKeys("Wonderful@2021");
		Thread.sleep(2000);
		confirmloginBtn.click();
		
	}
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
}
