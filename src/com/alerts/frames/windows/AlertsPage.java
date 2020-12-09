package com.alerts.frames.windows;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class AlertsPage extends BaseTest{
	@FindBy(xpath="//button[@id='alertButton']") private WebElement clickmealertbtn;
	public WebElement getclickmealertbtn()
	{
		return clickmealertbtn;
	}
	public void setclickmealertbtn()
	{
		clickmealertbtn.click();
	}
	
	@FindBy(xpath="//button[@id='timerAlertButton']") private WebElement timeclickmealertbtn;
	public WebElement gettimeclickmealertbtn()
	{
		return timeclickmealertbtn;
	}
	public void settimeclickmealertbtn()
	{
		timeclickmealertbtn.click();
	}
	@FindBy(xpath="//button[@id='confirmButton']") private WebElement confirmalertbtn;
	public WebElement getconfirmalertbtn()
	{
		return confirmalertbtn;
	}
	public void setconfirmalertbtn()
	{
		confirmalertbtn.click();
	}
	
	@FindBy(xpath="//button[@id='promtButton']") private WebElement promalertbtn;
	public WebElement getpromalertbtn()
	{
		return promalertbtn;
	}
	public void setpromalertbtn()
	{
		promalertbtn.click();
	}
	
	@FindBy(xpath="//div[.='Alerts'and @class='main-header']") private WebElement alertsheading;
	public WebElement getalertsheading()
	{
		return alertsheading;
	}
	
      public void AlertsTest() throws Throwable {
		
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(alertsheading,"Alerts"),flib.getPropKeyValue(PROPERTY_PATH, "alertsTitle"),"AlertsPage");	
	}
      
      public void testingalerts() throws InterruptedException, AWTException
      {
    	  //1st button
    	  clickmealertbtn.click(); 
    	  Alert al1=driver.switchTo().alert();
    	  System.out.println(al1.getText());
    	  Thread.sleep(1000);
    	  //al1.accept();
    	  al1.dismiss();
    	  
    	  //2nd button
    	  timeclickmealertbtn.click();
    	  Thread.sleep(6000);
    	  Alert al2=driver.switchTo().alert();
    	  Thread.sleep(3000);
    	  System.out.println(al2.getText());
    	  al2.accept();
    	 // al2.dismiss();
    	  
    	  //3rd button
    	  confirmalertbtn.click();
    	  Alert al3=driver.switchTo().alert();
    	  Thread.sleep(2000);
    	  System.out.println(al3.getText());
    	  al3.accept(); //This is for ok button
    	  //al3.dismiss(); //This is for cancel button in confirmation popup
    	  
    	  //4th button
    	  
  		promalertbtn.click();
  	  Alert al4=driver.switchTo().alert();
   	  Thread.sleep(2000);
   	  al4.sendKeys("Tripura");
   	  Thread.sleep(3000);
   	  System.out.println(al4.getText());
	  Thread.sleep(3000);
   	  al4.accept(); //This is for ok button
   	  //al4.dismiss(); //This is for cancel button in confirmation popup
   	  
  		
    	  
    	  
      }
	
	public AlertsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	

	
	

}
