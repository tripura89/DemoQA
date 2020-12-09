package com.demoqa.genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseTest{

	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public void verifyPage(String actualPage,String expectedPage, String pageName)
	{
		if(actualPage.equals(expectedPage))
		{
			System.out.println(pageName+"is displayed=====>passed");
		}
		else
			System.out.println(pageName+"is not Displayed====>failed");
		
	}
	public void waitForPageTitle(String title)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.titleIs(title));
	}
	
	public String waitForElementVisibility(WebElement element, String text)
	{
		WebDriverWait w=new WebDriverWait(driver,30);
		//w.until(ExpectedConditions.visibilityOf(element));
		w.until(ExpectedConditions.textToBePresentInElement(element, text));
		return text;
		
		
		
	}
	
	
}
