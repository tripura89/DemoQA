package com.alerts.frames.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;


public class BrowserWindowsPage extends BaseTest{
	//xpath=//button[@id='tabButton']
	@FindBy(xpath="//button[@id='tabButton']") private WebElement newtabbtn;
	public WebElement getnewtabbtn()
	{
		return newtabbtn;
	}
	public void clicknewtabbtn()
	{
		newtabbtn.click();
	}
	
	//xpath=//button[.='newwindowbtn']
	@FindBy(xpath="//button[@id='windowButton']") private WebElement newwindowbtn;
	public WebElement getnewwindowbtn()
	{
		return newwindowbtn;
	}
	public void clicknewwindowbtn()
	{
		newwindowbtn.click();
	}
	
	@FindBy(xpath="//button[@id='messageWindowButton']") private WebElement newwindowmsgbtn;
	public WebElement getnewwindowmsgbtn()
	{
		return newwindowmsgbtn;
	}
	public void clicknewwindowmsgbtn()
	{
		newwindowmsgbtn.click();
	}
	
	@FindBy(xpath="//div[.='Browser Windows' and @class='main-header']") private WebElement browserwindowsheading;
	public WebElement getbrowserwindowsheading()
	{
		return browserwindowsheading;
	}
	
public void browserwindowTest() throws Throwable {
		
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(browserwindowsheading,"Browser Windows"),flib.getPropKeyValue(PROPERTY_PATH, "browserwindowTitle"),"BrowserWindowPage");	
	}
	
	
 public void testingtabwindow() throws InterruptedException, AWTException
 {
	 Thread.sleep(2000);
      newtabbtn.click(); 
      Thread.sleep(2000);
      Robot r=new Robot();
      Thread.sleep(2000);
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_W);
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_W); //VK_W-----for chrome, //VK_C----firefox
      Thread.sleep(2000);
  	  newwindowbtn.click();
       Set<String> whs = driver.getWindowHandles();
        String psturl= driver.getCurrentUrl();
  
		 for(String wh:whs)
      {
    	  System.out.println(wh);
    	  String url = driver.switchTo().window(wh).getCurrentUrl();// https://demoqa.com/browser-windows----old window address
      	                                                             //  https://demoqa.com/sample-----new window address
    	  System.out.println(url);
    	
    	if(!url.equals("https://demoqa.com/browser-windows"))
    	  {
    		  driver.manage().window().maximize();
    		  Thread.sleep(2000);
    		  driver.close();
    		 
    	  }
    	 
      }
   Thread.sleep(10000);
   newwindowmsgbtn.click();
   Set<String> whs1 = driver.getWindowHandles();
   String psturlwmsg= driver.getCurrentUrl();

	 for(String wh1:whs1)
 {
	  System.out.println(wh1);
	  String urlwmsg = driver.switchTo().window(wh1).getCurrentUrl();
	  System.out.println(urlwmsg);
	  
 }
    
      
      
 }
      
      public BrowserWindowsPage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
 }
	



