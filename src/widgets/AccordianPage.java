package widgets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class AccordianPage extends BaseTest{
	@FindBy(xpath="//div[@id='section1Heading']") private WebElement section1heading;
	public WebElement getsection1heading()
	{
		return section1heading;
	}
	public void setsection1heading()
	{
		section1heading.click();
		System.out.println("This is section1");
	}
	
	@FindBy(xpath="//div[@id='section2Heading']") private WebElement section2heading;
	public WebElement getsection2heading()
	{
		return section2heading;
	}
	public void setsection2heading()
	{
		section2heading.click();
		System.out.println("This is section2");
	}
	
	
	@FindBy(xpath="//div[@id='section3Heading']") private WebElement section3heading;
	public WebElement getsection3heading()
	{
		return section3heading;
	}
	public void setsection3heading()
	{   
		
		Point loc = section3heading.getLocation();
        JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy"+loc);
		section3heading.click();
		System.out.println("This is section3");
	} 
	
	@FindBy(xpath="//div[.='Accordian' and @class='main-header']") private WebElement accordianheading;
	public WebElement getaccordianheading()
	{
		return accordianheading;
	}
	
	public void AccordianTest() throws Throwable
	{
		FileLib flib=new FileLib();
    	WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(accordianheading,"Accordian"),flib.getPropKeyValue(PROPERTY_PATH, "accordianTitle"),"AccordianPage");
    	
	}
	
	public AccordianPage()
	{
		PageFactory.initElements(driver, this);
	}


}
