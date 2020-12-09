package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class AutoCompletePage extends BaseTest{
	@FindBy(xpath="//input[@id='autoCompleteMultipleInput']") private WebElement multiplecolortxtbox;
	public WebElement getmultiplecolortxtbox()
	{
		return multiplecolortxtbox;
	}
	public void setmultiplecolortxtbox(String color1)
	{
		multiplecolortxtbox.sendKeys(color1);
	}
	
	@FindBy(xpath="//input[@id='autoCompleteSingleInput']") private WebElement singlecolortxtbox;
	public WebElement getsinglecolortxtbox()
	{
		return singlecolortxtbox;
	}
	public void setsinglecolortxtbox(String color)
	{
		singlecolortxtbox.sendKeys(color);
	}
	
	
	
//xpath:"//div[.='Aqua'] and @class=['css-1rhbuit-multiValue auto-complete__multi-value']"
	//Here we fetching text only so //div[.='Aqua'] text is enough but not class
	//class takes whole box for every color class is same so it is unable to find the xpath
	
	@FindBy(xpath="//div[.='Aqua']") private WebElement firstcolor;
	public WebElement getfirstcolor()
	{
		return firstcolor;
	}
	public void setfirstcolor()
	{
		firstcolor.click();
	}
	
	@FindBy(xpath="//div[.='Black']") private WebElement secondcolor;
	public WebElement getsecondtcolor()
	{
		return secondcolor;
	}
	public void setsecondcolor()
	{
		secondcolor.click();
	}
	
	@FindBy(xpath="//div[.='Green']") private WebElement thirdcolor;
	public WebElement getthirdcolor()
	{
		return thirdcolor;
	}
	public void setthirdcolor()
	{
		thirdcolor.click();
	}
	
	@FindBy(xpath="//div[.='Indigo']") private WebElement fourthcolor;
	public WebElement getfourthcolor()
	{
		return fourthcolor;
	}
	public void setfourthcolor()
	{
		fourthcolor.click();
	}
	
	@FindBy(xpath="//div[.='Blue']") private WebElement fifthcolor;
	public WebElement getfifthcolor()
	{
		return fifthcolor;
	}
	public void setfifthcolor()
	{
		fifthcolor.click();
	}
	
	@FindBy(xpath="//div[.='Magenta']") private WebElement sixthcolor;
	public WebElement getsixthcolor()
	{
		return sixthcolor;
	}
	public void setsixcolor()
	{
		sixthcolor.click();
	}
	
	@FindBy(xpath="//div[.='Yellow']") private WebElement seventhcolor;
	public WebElement getseventhcolor()
	{
		return seventhcolor;
	}
	public void setseventhcolor()
	{
		seventhcolor.click();
	}
	

	@FindBy(xpath="//div[.='White']") private WebElement eigthcolor;
	public WebElement geteigthcolor()
	{
		return eigthcolor;
	}
	public void seteigthcolor()
	{
		eigthcolor.click();
	}
	
	@FindBy(xpath="//div[.='Voilet']") private WebElement ninethcolor;
	public WebElement getninethcolor()
	{
		return ninethcolor;
	}
	public void setninethcolor()
	{
		ninethcolor.click();
	}
	
	@FindBy(xpath="//div[.='Auto Complete' and @class='main-header']") private WebElement autocompleteheading;
	public WebElement getautocompleteheading()
	{
		return autocompleteheading;
	}
	
	public void AutocompleteTest() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(autocompleteheading,"Auto Complete"),flib.getPropKeyValue(PROPERTY_PATH, "autocompleteTitle"),"AutoCompletePage");
    	
	}
	
	public void colorslist(String color1,String color2,String color3,String color4,String color5,String color6,String color7,String color8,String color9,String colorsingle1,String colorsingle2) throws InterruptedException
	{
		multiplecolortxtbox.sendKeys(color1);
		Thread.sleep(2000);
		firstcolor.click();
		
		multiplecolortxtbox.sendKeys(color2);
		Thread.sleep(2000);
		secondcolor.click();
		
		multiplecolortxtbox.sendKeys(color3);
		Thread.sleep(2000);
		thirdcolor.click();
		
		multiplecolortxtbox.sendKeys(color4);
		Thread.sleep(2000);
		fourthcolor.click();
		
		multiplecolortxtbox.sendKeys(color5);
		Thread.sleep(2000);
		fifthcolor.click();
		
		multiplecolortxtbox.sendKeys(color6);
		Thread.sleep(2000);
		sixthcolor.click();
		
		multiplecolortxtbox.sendKeys(color6);
		Thread.sleep(2000);
		sixthcolor.click();
		
//		multiplecolortxtbox.sendKeys(color7);
//		Thread.sleep(2000);
//		seventhcolor.click();
		
		multiplecolortxtbox.sendKeys(color8);
		Thread.sleep(2000);
		eigthcolor.click();
		
//		multiplecolortxtbox.sendKeys(color9);
//		Thread.sleep(2000);
//		ninethcolor.click();
			
		singlecolortxtbox.sendKeys(colorsingle1);
		Thread.sleep(2000);
		ninethcolor.click();
		Thread.sleep(2000);
		singlecolortxtbox.sendKeys(colorsingle2);
		Thread.sleep(2000);
		seventhcolor.click();
	}
	public AutoCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
