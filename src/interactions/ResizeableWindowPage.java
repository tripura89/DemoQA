package interactions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ResizeableWindowPage extends BaseTest{
	
	@FindBy(xpath="//div[@id='resizableBoxWithRestriction']") private WebElement resizeboxwithrestrict;
	public WebElement getresizeboxwithrestrict()
	{
		return resizeboxwithrestrict;
	}
	public void setresizeboxwithrestrict() throws InterruptedException
	{ 
		Dimension d=new Dimension(500,300);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		System.out.println("resize box with 5*3 hundred dimension");
		Thread.sleep(2000);
		
		Dimension d1=new Dimension(400,200);
		driver.manage().window().setSize(d1);
		System.out.println("resize box with 4*2 hundred dimension");
	}
	
	@FindBy(xpath="//div[@id='resizable']") private WebElement resizewithoutrestrict;
	public WebElement getresizewithoutrestrict()
	{
		return resizewithoutrestrict;
	}
	public void setresizewithoutrestrict() throws InterruptedException
	{ 
		Dimension d=new Dimension(500,300);
		driver.manage().window().setSize(d);
		System.out.println("resize box with 5*3 hundred dimension");
		Thread.sleep(2000);
		
		Dimension d1=new Dimension(800,300);
		driver.manage().window().setSize(d);
		System.out.println("resize box with 8*3 hundred dimension");
		
	}
		@FindBy(xpath="//div[.='Resizable' and @class='main-header']") private WebElement resizableheading;
		public WebElement getresizableheading()
		{
			return resizableheading;
		}
		
		public void ResizableTest() throws Throwable
		{
			FileLib flib=new FileLib();
	    	WebDriverCommonLib wlib=new WebDriverCommonLib();
	    	wlib.verifyPage(wlib.waitForElementVisibility(resizableheading,"Resizable"),flib.getPropKeyValue(PROPERTY_PATH, "resizableTitle"),"ResizablePage");
	    	
		}
		
		
	public ResizeableWindowPage()
	{
		PageFactory.initElements(driver, this);
	}
}
