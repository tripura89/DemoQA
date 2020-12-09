package interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ResizablePage extends BaseTest{
@FindBy(xpath="//div[@id='resizableBoxWithRestriction']") private WebElement resizeboxwithrestrict;
public WebElement getresizeboxwithrestrict()
{
	return resizeboxwithrestrict;
}

@FindBy(xpath="//div[@id='resizable']") private WebElement resizewithoutrestrict;
public WebElement getresizewithoutrestrict()
{
	return resizewithoutrestrict;
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
	
	Actions a=new Actions(driver);
	a.clickAndHold(resizeboxwithrestrict).perform();
	Thread.sleep(2000);
	a.dragAndDropBy(resizeboxwithrestrict, 180, 150);
	System.out.println("resizebox with strict  ");
	
	Actions a1=new Actions(driver);
	a.clickAndHold(resizewithoutrestrict).perform();
	Thread.sleep(2000);
	a.dragAndDropBy(resizeboxwithrestrict, 200, 200);
	System.out.println("resizebox without strict ");
}




public ResizablePage()
{
	PageFactory.initElements(driver, this);
}
}