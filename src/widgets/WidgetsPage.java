package widgets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;

public class WidgetsPage extends BaseTest{
	
	@FindBy(xpath="//div[.='Widgets']/..") private WebElement widgetsdropbox;
	public WebElement getwidgetsdropbox()
	{
		return widgetsdropbox;
	}
	public void clickwidgetsdropbox() throws InterruptedException
	{
		 Point loc = widgetsdropbox.getLocation();
		    JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy"+loc);
		widgetsdropbox.click();
		//Thread.sleep(2000);
		 
	}
	
	@FindBy(xpath="//span[.='Accordian']/..") private WebElement accordian;
	public WebElement getaccordian()
	{
		return accordian;
	}
	public void setaccordian()
	{
		Point loc1 = accordian.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc1);
		accordian.click();
	}

	@FindBy(xpath="//span[.='Auto Complete']/..") private WebElement autocomplete;
	public WebElement getautocomplete()
	{
		return autocomplete;
	}
	public void setautocomplete()
	{
		Point loc2 = autocomplete.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc2);
		autocomplete.click();
	}
	
	@FindBy(xpath="//span[.='Date Picker']/..") private WebElement datepicker;
	public WebElement getdatepicker()
	{
		return  datepicker;
	}
	public void setdatepicker()
	{
		Point loc3 = autocomplete.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc3);
		 datepicker.click();
	}
	
	@FindBy(xpath="//span[.='Progress Bar']/..") private WebElement progressbar;
	public WebElement getprogressbar()
	{
		return  progressbar;
	}
	public void setprogressbar()
	{
		Point loc4 = progressbar.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc4);
		progressbar.click();
	}
	
	@FindBy(xpath="//span[.='Tabs']/..") private WebElement tabs;
	public WebElement gettabs()
	{
		return tabs;
	}
	public void settabs()
	{
		Point loc4 = tabs.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc4);
		tabs.click();
	}
	
	@FindBy(xpath="//span[.='Slider']/..") private WebElement slider;
	public WebElement getslider()
	{
		return slider;
	}
	public void setslider()
	{
		Point loc4 = tabs.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc4);
		slider.click();
	}
	
	
	@FindBy(xpath="//span[.='Tool Tips']/..") private WebElement tooltips;
	public WebElement gettooltip()
	{
		return tooltips;
	}
	public void settooltips()
	{
		Point loc4 = tabs.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc4);
		tooltips.click();
	}
	
	
	@FindBy(xpath="//span[.='Menu']/..") private WebElement menu;
	public WebElement getmenu()
	{
		return tooltips;
	}
	public void setmenu()
	{
		Point loc4 = menu.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc4);
		menu.click();
	}
	
	
	@FindBy(xpath="//span[.='Select Menu']/..") private WebElement selectmenu;
	public WebElement getselectmenu()
	{
		return selectmenu;
	}
	public void setselectmenu()
	{
		Point loc4 = selectmenu.getLocation();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc4);
		selectmenu.click();
	}
		
	public WidgetsPage()
	{
		PageFactory.initElements(driver,this);
	}
}
