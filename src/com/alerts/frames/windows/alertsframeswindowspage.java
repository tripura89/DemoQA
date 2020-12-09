package com.alerts.frames.windows;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.demoqa.genericlib.BaseTest;

public class alertsframeswindowspage extends BaseTest{
	
	@FindBy(xpath="//div[.='Alerts, Frame & Windows'] /..") private WebElement afwdropbox;
	public WebElement getafwdropbox()
	{
		return afwdropbox;
	}
	public void clickafwdropbox() throws InterruptedException
	{
		afwdropbox.click();
		Thread.sleep(2000);
		 Point loc = afwdropbox.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc);
	}
	
	//xpath=//span[.='BrowserWindows']//li
	@FindBy(xpath="//span[.='Browser Windows']/..") private WebElement browserwindows;
	public WebElement getbrowserwindows()
	{
		return browserwindows;
	}
	public void clickbrowserwindows()
	{
		browserwindows.click();
	}
	//xpath="//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-1']"
	@FindBy(xpath="//span[.='Alerts']/..") private WebElement alerts;
	public WebElement getalerts()
	{
		return alerts;
	}
	public void clickalerts()
	{
		alerts.click();
	}
//xpath="//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-2']"
	@FindBy(xpath="//span[.='Frames']/..") private WebElement frames;
	public WebElement getframes()
	{
		return frames;
	}
	public void clickframes()
	{
		frames.click();
	}
	
	@FindBy(xpath="//span[.='Nested Frames']/..") private WebElement nestedframes;
	public WebElement getnestedframes()
	{
		return nestedframes;
	}
	public void clicknestedframes()
	{
		nestedframes.click();
	}
	
	@FindBy(xpath="//span[.='Modal Dialogs']/..") private WebElement modaldialogs;
	public WebElement getmodaldialogs()
	{
		return modaldialogs;
	}
	
	public void clickmodaldialogs()
	{
		modaldialogs.click();
	}
	
	public alertsframeswindowspage()
	{
		PageFactory.initElements(driver,this);
	}
	
}
