package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ToolTipPage extends BaseTest{
	
	@FindBy(xpath="//button[@id='toolTipButton']") private WebElement tooltipbtn;
	public WebElement gettooltipbtn()
	{
		return tooltipbtn;
	}
	public void settooltipbtn()
	{
	
	}
	
	@FindBy(xpath="//div[.='Tool Tips' and @class='main-header']") private WebElement tooltipsheading;
	public WebElement gettooltipsheading()
	{
		return tooltipsheading;
	}
	
	public void ToolTipTest() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(tooltipsheading,"Tool Tips"),flib.getPropKeyValue(PROPERTY_PATH, "tooltipsTitle"),"ToolTipsPage");
        Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(tooltipbtn).perform();
        System.out.println("moved to tooltipbtn");
        Thread.sleep(2000);
        a.moveToElement(tooltiptxtbox).perform();
        System.out.println("moved to tooltiptextbox");
	}
	
	@FindBy(xpath="//input[@id='toolTipTextField']") private WebElement tooltiptxtbox;
	public WebElement gettooltiptxtbox()
	{
		return tooltiptxtbox;
	}
	public void settooltiptxtbox()
	{
	
	}
	
	
	public ToolTipPage()
	{
		PageFactory.initElements(driver,this);
	}
}
