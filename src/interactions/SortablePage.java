package interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class SortablePage extends BaseTest{
	@FindBy(xpath="//a[@id='demo-tab-list']") private WebElement listlink;
	public WebElement getlistlink()
	{
		return listlink;
	}
	public void setlistlink()
	{ 
		gridlink.click();
		listlink.click();
		System.out.println("list link is clicked");
	}
	
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
	
	@FindBy(xpath="//div[.='Sortable' and @class='main-header']") private WebElement sortableheading;
	public WebElement getsortableheading()
	{
		return sortableheading;
	}
	
	public void SortableTest() throws Throwable
	{
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(sortableheading,"Sortable"),flib.getPropKeyValue(PROPERTY_PATH, "sortableTitle"),"SortablePage");
    	
	}
	
	public SortablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
}
