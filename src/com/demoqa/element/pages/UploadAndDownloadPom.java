package com.demoqa.element.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class UploadAndDownloadPom extends BaseTest{
	@FindBy(xpath="//a[@id='downloadButton']") private WebElement downloadbtn;
	public WebElement getdownloadbtn()
	{
		return downloadbtn;
	}
	
	public void clickdownloadbtn() throws InterruptedException, AWTException 
	{
		downloadbtn.click();
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000); 
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_CANCEL);
		//Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CANCEL);
	}
	
	@FindBy(xpath="//input[@id='uploadFile']") private WebElement selectafilebtn;
	public WebElement getselectafilebtn()
	{
		return selectafilebtn;
	}
	
	public void clickselectafilebtn() throws InterruptedException, AWTException 
	{
		//for firefox
		Thread.sleep(3000);
		selectafilebtn.sendKeys("C:\\Users\\tripu\\Desktop\\demoqa.txt");
				
	}
	
	@FindBy(xpath="//div[@class='main-header']") private WebElement uploadndownloadheading;
	public WebElement getbuttonhead()
	{
		return uploadndownloadheading;
		
	}
       public void uploadndownloadTest() throws Throwable {
    	
    	FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(uploadndownloadheading,"Upload and Download"),flib.getPropKeyValue(PROPERTY_PATH, "uploadndownloadTitle"),"UploadandDownloadPage");
    	
    }
       
      public UploadAndDownloadPom()
      {
    	  PageFactory.initElements(driver, this);
      }
       
    

}
