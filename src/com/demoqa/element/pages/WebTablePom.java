package com.demoqa.element.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class WebTablePom extends BaseTest{
	@FindBy(xpath="//button[@id='addNewRecordButton']") private WebElement wbtbaddbtn;
	public WebElement getwbtbaddbtn()
	{
		return wbtbaddbtn;
	}
	public void clickwbtbaddbtn()
	{
		wbtbaddbtn.click();
	}
	
	@FindBy(id="firstName") private WebElement frnametxtbox;
	public WebElement getfrnametxtbox()
	{
		return frnametxtbox;
	}
	public void setfrnametxtbox(String firstname)
	{
		
		frnametxtbox.sendKeys(firstname);
		
	}
	
	@FindBy(id="lastName") private WebElement lnametxtbox;
	public WebElement getlnametxtbox()
	{
		return lnametxtbox;
	}
	public void setlnametxtbox(String lname)
	{
		lnametxtbox.sendKeys(lname);
	}

@FindBy(id="userEmail") private WebElement usemailtxtbox;
public WebElement getusemailtxtbox()
{
	return usemailtxtbox;
	
}
public void setusemailtxtbox(String email)
{
	usemailtxtbox.sendKeys(email);
}
@FindBy(id="age") private WebElement agetxtbox;
public WebElement getagetxtbox()
{
	return agetxtbox;
}
public void setagetxtbox(String age)
{
	 agetxtbox.sendKeys(age);
}
@FindBy(id="salary") private WebElement saltxtbox;
public WebElement getsaltxtbox()
{
	return saltxtbox;
}
public void setsaltxtbox(CharSequence salary)
{
	saltxtbox.sendKeys(salary);
}
@FindBy(id="department") private WebElement depmttxtbox;
public WebElement getdepmttxtbox()
{
	return depmttxtbox;
}
public void setdepmttxtbox(String department)
{
	depmttxtbox.sendKeys(department);
}

@FindBy(id="submit") private WebElement submitbtn;
public WebElement getsubmitbtn()
{
	return submitbtn;
}
public void clicksubmitbtn()
{
	submitbtn.click();
}
@FindBy(xpath="//div[.='Registration Form']") private WebElement webtableHeading;
public WebElement getresgtionformheading()
{
	return webtableHeading;   //this is resigtragtion heading
}
/*public void setwebtableHeading()
{
	
}  Registration form checking */
public WebTablePom()
{
	PageFactory.initElements(driver,this);
}

public void webtableTest() throws Throwable {
	{
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(webtableHeading,"Registration Form"),flib.getPropKeyValue(PROPERTY_PATH, "webtableTitle"),"WebTablePage");
    	
	}
}
	public void eleofWebTable(String firstname,String lastname, String email, String age, String salary, String department) throws Throwable
	{
		Thread.sleep(4000);
		wbtbaddbtn.click();
	    webtableTest(); 
		frnametxtbox.sendKeys(firstname);
		Thread.sleep(2000);
		lnametxtbox.sendKeys(lastname);
		usemailtxtbox.sendKeys(email);
		agetxtbox.sendKeys(age);
		saltxtbox.sendKeys(salary);
		depmttxtbox.sendKeys(department);
		submitbtn.click();
	}


}
