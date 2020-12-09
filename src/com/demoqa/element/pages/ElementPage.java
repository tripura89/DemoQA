package com.demoqa.element.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;

public class ElementPage extends BaseTest{
	
	@FindBy(xpath="//div[.='Elements']/..") private WebElement eledropbox;
	public WebElement geteledropbox()
	{
		return eledropbox;
	}
	public void clickeledropbox()
	{
		eledropbox.click();
	}
	
	@FindBy(xpath="//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-0']")private WebElement txtbox;
	public WebElement gettxtbox()
	{
		return txtbox;
	}
     public void clicktxtbox()
     {
    	 txtbox.click();
     }
     
     public void elementClick() throws InterruptedException
     {
    	 eledropbox.click();
    	 Thread.sleep(2000); 
    	 txtbox.click();
    	 
     }
     
     @FindBy(xpath="//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-1']") private WebElement checkbox;
     public WebElement getcheckbox()
     {
    	 return checkbox;
     }
     public void clickcheckbox()
     {
    	 checkbox.click();
     }
     
     public void elementCheckBoxClick() throws InterruptedException
     {
    	 eledropbox.click();
    	 Thread.sleep(2000);
    	 checkbox.click();
     }
     
     public ElementPage()
     {
   	  PageFactory.initElements(driver,this);
     }
     
     
     
     @FindBy(xpath="//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-2']") private WebElement rdobutton;
     public WebElement getrdobutton()
     {
    	 return rdobutton;
     }
     public void clickrdobutton()
     {
    	 rdobutton.click();
     }
     
     
     public void elementRadioButtonClick() throws InterruptedException
     {
    	 eledropbox.click();
    	 Thread.sleep(2000);
    	 Point loc=rdobutton.getLocation();
         System.out.println(loc);
    	 JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 jse.executeScript("window.scrollBy"+loc);
    	 rdobutton.click();
     }
       
     @FindBy(xpath="//li[@id='item-3']")private WebElement webtablesbtn;
     public WebElement getwebtablesbtn()
     {
    	 return webtablesbtn;
     }
     public void clickwebtablesbtn()
     {
    	 webtablesbtn.click();
     }
     
     public void elementWebTableClick() throws InterruptedException 
     {
    	 eledropbox.click();
    	 Thread.sleep(4000);
    	 Point loc=webtablesbtn.getLocation();
         System.out.println(loc);
    	 JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 jse.executeScript("window.scrollBy"+loc);
    	 webtablesbtn.click();
    	 
     }
     
     @FindBy(xpath="//li[@id='item-4']")private WebElement buttonsbtn;
     public WebElement getbuttonsbtn()
     {
    	 return buttonsbtn;
     }
     public void clickbuttonsbtn()
     {
    	 buttonsbtn.click();
     }
     
     public void elementbuttonsclick() throws InterruptedException
     {
    	 eledropbox.click();
    	 Thread.sleep(1000);
    	 Point loc=buttonsbtn.getLocation();
         System.out.println(loc);
    	 JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 jse.executeScript("window.scrollBy"+loc);
    	 //click on required positon
    	 buttonsbtn.click();
     }
     
     @FindBy(xpath="//li[@id='item-5']")private WebElement linksbtn;
     public WebElement getlinksbtn()
     {
    	 return linksbtn;
     }
     public void clicklinksbtn() throws InterruptedException
     {
    	 eledropbox.click();
    	 Thread.sleep(1000);
    	 Point loc=linksbtn.getLocation();
         System.out.println(loc);
    	 JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 jse.executeScript("window.scrollBy"+loc);
    	 linksbtn.click();
     }
     
     
     @FindBy(xpath="//li[@id='item-6']") private WebElement uploadndownloadbtn;
     public WebElement getuploadndownloadbtn()
     {
    	 return uploadndownloadbtn;
     }
     public void clickuploadndownloadbtn()
     {
    	 uploadndownloadbtn.click();
     }
     
     public void elementuploadndownloadclick() throws InterruptedException
     {
    	 eledropbox.click();
    	 Thread.sleep(1000);
    	 Point loc=uploadndownloadbtn.getLocation();
    	 System.out.println(loc);
    	 JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 jse.executeScript("window.scrollBy"+loc);
    	 //click on required positon
    	 uploadndownloadbtn.click();
    	 
     }
     
}
