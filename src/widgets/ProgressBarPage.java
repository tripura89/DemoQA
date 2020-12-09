package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ProgressBarPage extends BaseTest{
	
	@FindBy(xpath="//button[@id='startStopButton']") private WebElement startstopbtn;
	public WebElement getstartstopbtn()
	{
		return startstopbtn;
	}
	public void clickstartstopbtn()
	{
		startstopbtn.click();
	}
	
	  @FindBy(xpath="//div[.='Progress Bar' and @class='main-header']") private WebElement progressbarheading;
	    public WebElement getprogressbarheading()
	    {
	    	return progressbarheading;
	    }
	    
	    public void ProgressBarTest() throws Throwable {
	    	FileLib flib=new FileLib();
			WebDriverCommonLib wlib=new WebDriverCommonLib();
	    	wlib.verifyPage(wlib.waitForElementVisibility(progressbarheading,"Progress Bar"),flib.getPropKeyValue(PROPERTY_PATH, "progressbarTitle"),"ProgressBarPage");
	    	
	    }
	    
	    public ProgressBarPage()
	    {
	    	PageFactory.initElements(driver,this);
	    }

}
