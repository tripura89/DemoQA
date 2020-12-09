package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class MenuPage extends BaseTest{
	
	@FindBy(xpath="//a[.='Main Item 1']") private WebElement menuitem1link;
	public WebElement getmenuitem1link()
	{
		return menuitem1link;
	}
	@FindBy(xpath="//a[.='Main Item 2']") private WebElement menuitem2link;
	public WebElement getmenuitem2link()
	{
		return menuitem2link;
	}
	@FindBy(xpath="//a[.='SUB SUB LIST »']") private WebElement subsublistlink;
	public WebElement getsubsublistlink()
	{
		return subsublistlink;
	}
	
	
	@FindBy(xpath="//a[.='Main Item 3']") private WebElement menuitem3link;
	public WebElement getmenubtn()
	{
		return menuitem3link;
	}
	
	
	@FindBy(xpath="//div[.='Menu' and @class='main-header']") private WebElement menuheading;
	public WebElement getmenusheading()
	{
		return menuheading;
	}
	
	public void MenuTest() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(menuheading,"Menu"),flib.getPropKeyValue(PROPERTY_PATH, "menuTitle"),"MenuPage");
        Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(menuitem1link).perform();
        System.out.println("moved to menumainitem1");
        Thread.sleep(2000);
        a.moveToElement(menuitem2link).perform();
        System.out.println("moved to menumainitem2");
        Thread.sleep(2000);
        a.moveToElement(subsublistlink).perform();
        System.out.println("moved to mainitem2sublist");
        Thread.sleep(2000);
        a.moveToElement(menuitem3link).perform();
        System.out.println("moved to menumainitem3");
        
	}

	public MenuPage()
	{
		PageFactory.initElements(driver,this);
	}

}
