package interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class SelectablePage extends BaseTest
{
	@FindBy(xpath="//a[@id='demo-tab-list']") private WebElement listlink;
	public WebElement getlistlink()
	{
		return listlink;
	}
	public void setlistlink()
	{ 
		listlink.click();
		System.out.println("list link is clicked");
	}
	
	
	@FindBy(xpath="//li[.='Cras justo odio']") private WebElement firstlink;
	public WebElement getfirstlink()
	{
		return firstlink;
	}
	public void setfristlink()
	{ 
		firstlink.click();
		System.out.println("first list link is clicked");
	}
	
	@FindBy(xpath="//li[.='Dapibus ac facilisis in']") private WebElement secondlink;
	public WebElement getsecondlink()
	{
		return secondlink;
	}
	public void setsecondlink()
	{ 
		secondlink.click();
		System.out.println("second list link is clicked");
	}
	
	@FindBy(xpath="//li[.='Morbi leo risus']") private WebElement thirdlink;
	public WebElement getthirdlink()
	{
		return thirdlink;
	}
	public void setthirdlink()
	{ 
		thirdlink.click();
		System.out.println("Third list link is clicked");
		
	}
	
	
	@FindBy(xpath="//li[.='Porta ac consectetur ac']") private WebElement fourthlink;
	public WebElement getfourthlink()
	{
		return fourthlink;
	}
	public void setfourthlink()
	{ 
		fourthlink.click();
		System.out.println("fourth list link is clicked");
	}
	
	
	public void ListExecution() throws InterruptedException
	{
		listlink.click();
		System.out.println("list link is clicked");
		Thread.sleep(2000);

		firstlink.click();
		System.out.println("first list link is clicked");
		Thread.sleep(2000);
		secondlink.click();
		System.out.println("second list link is clicked");
		Thread.sleep(2000);
		thirdlink.click();
		System.out.println("Third list link is clicked");
		Thread.sleep(2000);

		fourthlink.click();
		System.out.println("fourth list link is clicked");
		
		
	}
	
	//grid link
	
	@FindBy(xpath="//a[@id='demo-tab-grid']") private WebElement gridlink;
	public WebElement getgridlink()
	{
		return gridlink;
	}
	public void setgridlink()
	{ 
		listlink.click();
		gridlink.click();
		System.out.println("grid link is clicked");

	}
	
	@FindBy(xpath="//li[.='One']") private WebElement onelink;
	public WebElement getonelink()
	{
		return onelink;
	}
	public void setonelink()
	{ 
	   onelink.click();
	}
	@FindBy(xpath="//li[.='Two']") private WebElement secondgridlink;
	public WebElement getsecondgridlink()
	{
		return secondgridlink;
	}
	public void setsecondgridlink()
	{ 
		secondgridlink.click();
	}
	@FindBy(xpath="//li[.='Three']") private WebElement thirdgridlink;
	public WebElement getthirdgridlink()
	{
		return thirdgridlink;
	}
	public void setthirdgridlink()
	{ 
		thirdgridlink.click();
	}
	
	@FindBy(xpath="//li[.='Four']") private WebElement fourthgridlink;
	public WebElement getfourthgridlink()
	{
		return fourthgridlink;
	}
	public void setfourthgridlink()
	{ 
		fourthgridlink.click();
	}
	
	
	@FindBy(xpath="//li[.='Five']") private WebElement fifthgridlink;
	public WebElement getfifthgridlink()
	{
		return fifthgridlink;
	}
	public void setfifthgridlink()
	{ 
		fifthgridlink.click();
	}
	@FindBy(xpath="//li[.='Five']") private WebElement fivegridlink;
	public WebElement getfivegridlink()
	{
		return fivegridlink;
	}
	public void setfivegridlink()
	{ 
		fivegridlink.click();
	}
	
	@FindBy(xpath="//li[.='Six']") private WebElement sixthgridlink;
	public WebElement getsixthgridlink()
	{
		return sixthgridlink;
	}
	public void setsixthgridlink()
	{ 
		sixthgridlink.click();
	}
	
	@FindBy(xpath="//li[.='Seven']") private WebElement seventhgridlink;
	public WebElement getseventhgridlink()
	{
		return seventhgridlink;
	}
	public void setseventhgridlink()
	{ 
		seventhgridlink.click();
	}
	
	@FindBy(xpath="//li[.='Eight']") private WebElement eigthgridlink;
	public WebElement geteigthgridlink()
	{
		return eigthgridlink;
	}
	public void seteigthgridlink()
	{ 
		eigthgridlink.click();
	}
	
	@FindBy(xpath="//li[.='Nine']") private WebElement ninethgridlink;
	public WebElement getninethgridlink()
	{
		return ninethgridlink;
	}
	public void setninethgridlink()
	{ 
		ninethgridlink.click();
	}
	
	
	
	public void GridExecution() throws InterruptedException
	{
		listlink.click();
		gridlink.click();
		System.out.println("grid link is clicked");
		Thread.sleep(2000);
		onelink.click();
		Thread.sleep(2000);
		secondgridlink.click();
		Thread.sleep(2000);
		thirdgridlink.click();
		Thread.sleep(2000);
		fourthgridlink.click();
		Thread.sleep(2000);
		fifthgridlink.click();
		
		sixthgridlink.click();
		
		seventhgridlink.click();
		
		eigthgridlink.click();
		
		ninethgridlink.click();

		
		
	}
	
	@FindBy(xpath="//div[.='Selectable' and @class='main-header']") private WebElement selectableheading;
	public WebElement getselectableheading()
	{
		return selectableheading;
	}
	
	public void SelectableTest() throws Throwable
	{
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(selectableheading,"Selectable"),flib.getPropKeyValue(PROPERTY_PATH, "selectableTitle"),"SelectablePage");
    	
	}
	
	public SelectablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
