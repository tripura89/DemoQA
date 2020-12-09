package widgets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class SelectMenuPage extends BaseTest{
	
	@FindBy(xpath="//div[@id='withOptGroup']") private WebElement selectvalueoptiondpbx;
	public WebElement getselectvaluedpbx()
	{
		return selectvalueoptiondpbx;
	}
	public void clickselectvalueoptiondpbx()
	{  
		
		selectvalueoptiondpbx.click();  
		
//		WebElement ddaddr = driver.findElement(By.id("withOptGroup"));
//		Select s=new Select(ddaddr);
//        List<WebElement> selopt=s.getOptions();
//        for(int i=0;i<selopt.size();i++)
//        {
//        	String text=selopt.get(i).getText();
//        	System.out.println(text);
//        }
		
	}
	
	@FindBy(xpath="//div[.='Group 1, option 1']") private WebElement spfcselectvalueoptiondpbx;
	public WebElement getspfcselectvalueoptiondpbx()
	{
		return spfcselectvalueoptiondpbx;
	}
	public void clickspfcselectvalueoptiondpbx()
	{  
		spfcselectvalueoptiondpbx.click();
	}
   
	@FindBy(xpath="//div[@id='selectOne']") private WebElement selectonedpbx;
	public WebElement getselectonedpbx()
	{
		return selectonedpbx;
	}
	public void clickselectonedpbx()
	{
		selectonedpbx.click();
//		WebElement ddaddr = driver.findElement(By.id("selectOne"));
//		Select s=new Select(ddaddr);
//        List<WebElement> selopt=s.getOptions();
//        for(int i=0;i<selopt.size();i++)
//        {
//        	String text=selopt.get(i).getText();
//        	System.out.println(text);
//        }
		
	}
	@FindBy(xpath="//div[.='Dr.']") private WebElement spfcselectonedpbx;
	public WebElement getspfcselectonedpbx()
	{
		return spfcselectonedpbx;
	}
	public void clickspfcselectonedpbx()
	{
		spfcselectonedpbx.click();  
	}
	
	//oldstyleselect menu	
	@FindBy(xpath="//select[@id='oldSelectMenu']") private WebElement oldselectmenudpbx;
	public WebElement getoldselectmenudpbx()
	{
		return oldselectmenudpbx;
	}
	public void clickoldselectmenudpbx()
	{
		oldselectmenudpbx.click();
		WebElement ddaddr = driver.findElement(By.id("oldSelectMenu"));
		Select sel=new Select(ddaddr);
		sel.selectByVisibleText("Red");
		sel.selectByIndex(3);// selecting yellow and staying there only hlo u just scroll down
	}
	
	@FindBy(xpath="//div[.='Select...' and @class=' css-1wa3eu0-placeholder']") private WebElement multiseldpdn;
	public WebElement getmultiseldpdnx()
	{
		return multiseldpdn;
	}
	public void clickmultiseldpdn()
	{
	     multiseldpdn.click();
	}
	
	@FindBy(xpath="//div[.='Green']") private WebElement greenoption;
	public WebElement getgreenoption()
	{
		return greenoption;
	}
	public void clickgreenoption()
	{
		greenoption.click();
	}
	
	@FindBy(xpath="//div[.='Blue']") private WebElement blueoption;
	public WebElement getblueoption()
	{
		return blueoption;
	}
	public void clickblueoption()
	{
		blueoption.click();
	}
	
	@FindBy(xpath="//div[.='Black']") private WebElement blackoption;
	public WebElement getblackoption()
	{
		return blackoption;
	}
	public void clickblackoption()
	{
		blackoption.click();
	}
	
	
	public void multiselectdropdown() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ multiseldpdn.getLocation());
		
		multiseldpdn.click();
		Thread.sleep(2000);
		greenoption.click();
		Thread.sleep(2000);
		blueoption.click();
		Thread.sleep(2000);
		blackoption.click();
		
	}
	
	
	
	@FindBy(xpath="//select[@id='cars']") private WebElement stdmultiseldpdn;
	public WebElement getstdmultiseldpdnx()
	{
		return stdmultiseldpdn;
	}
	public void clickstdmultiseldpdn()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ stdmultiseldpdn.getLocation());
		stdmultiseldpdn.click();
		WebElement ddaddr = driver.findElement(By.id("cars"));
		Select sel=new Select(ddaddr);
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Saab");
		sel.selectByIndex(3);
	
	}
	
	
	@FindBy(xpath="//div[.='Select Menu' and @class='main-header']") private WebElement selectmenuheading;
	public WebElement getselectmenuheading()
	{
		return selectmenuheading;
	}
	
	public void SelectMenuTest() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(selectmenuheading,"Select Menu"),flib.getPropKeyValue(PROPERTY_PATH, "selectmenuTitle"),"SelectMenuPage");
   }
	
	public SelectMenuPage()
	{
		PageFactory.initElements(driver, this);
	}
}

