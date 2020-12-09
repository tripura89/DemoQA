package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class TabsPage extends BaseTest{
	@FindBy(xpath="//a[@id='demo-tab-what']") private WebElement whatlink;
	public WebElement getwhatlink()
	{
		return whatlink;
	}
	public void  clickwhatlink()
	{
		whatlink.click();
	}
	@FindBy(xpath="//a[@id='demo-tab-origin']") private WebElement originlink;
	public WebElement getoriginlink()
	{
		return originlink;
	}
	public void clickoriginlink()
	{
		originlink.click();
	}
	@FindBy(xpath="//a[@id='demo-tab-use']") private WebElement uselink;
	public WebElement getuselink()
	{
		return uselink;
	}
	public void clickuselink()
	{
		uselink.click();
	}
	
	//disabled one
	@FindBy(xpath="//a[@id='demo-tab-use']") private WebElement morelink;
	public WebElement getmorelink()
	{
		return morelink;
	}
	public void clickmorelink()
	{
		morelink.click();
	}
	
	
	@FindBy(xpath="//div[.='Tabs' and @class='main-header']") private WebElement tabsheading;
    public WebElement gettabsheading()
    {
    	return tabsheading;
    }
    
    public void TabsTest() throws Throwable {
    	FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(tabsheading,"Tabs"),flib.getPropKeyValue(PROPERTY_PATH, "tabsTitle"),"TabsPage");
    	
    }
    
    public void executelinks() throws InterruptedException {
    	originlink.click();
    	Thread.sleep(2000);
    	whatlink.click();
    	uselink.click();
    	Thread.sleep(2000);
    	whatlink.click();
    	
    }
    
    public TabsPage()
    {
    	PageFactory.initElements(driver,this);
    }
}
