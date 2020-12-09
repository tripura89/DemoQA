package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DatePickerPage extends BaseTest{
	@FindBy(xpath="//input[@id='datePickerMonthYearInput']") private WebElement selectdatepicker;
	public WebElement getselectdatepicker()
	{
		return selectdatepicker;
	}
	public void setselectdatepicker()
	{
		selectdatepicker.click();
	}
	
	@FindBy(xpath="//div[@aria-label='Choose Wednesday, September 30th, 2020']") private WebElement selectspecificdate;
    public WebElement getselectspecificdate()
    {
    	return selectspecificdate;
    }
    public void setselectspecificdate()
    {
    	selectspecificdate.click();
    	
    }
    @FindBy(xpath="//div[.='Date Picker' and @class='main-header']") private WebElement datepickerheading;
    public WebElement getdatepickerheading()
    {
    	return selectspecificdate;
    }
    
    public void DatePickerTest() throws Throwable {
    	FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(datepickerheading,"Date Picker"),flib.getPropKeyValue(PROPERTY_PATH, "datepickerTitle"),"DatePickerPage");
    	
    }
    
    
    //2nd textbox
    @FindBy(xpath="//input[@id='dateAndTimePickerInput']") private WebElement selectdatetimepicker;
	public WebElement getselectdatetimepicker()
	{
		return selectdatetimepicker;
	}
	public void setselectdatetimepicker()
	{
		selectdatetimepicker.click();
	}
	@FindBy(xpath="//div[@aria-label='Choose Friday, October 2nd, 2020']") private WebElement selectspecificdatetime;
    public WebElement getselectspecificdatetime()
    {
    	return selectspecificdatetime;
    }
    public void setselectspecificdatetime1()
    {
    	selectspecificdatetime.click();
    	
    }
    
 
    
    @FindBy(xpath="//li[.='17:15']") private WebElement selectspecifictime;
    public WebElement getselectspecifictime()
    {
    	return selectspecificdatetime;
    }
    public void setselectspecifictime()
    {
    	selectspecifictime.click();
    	
    }
    
    public void SecondDateAndTimePicker() throws InterruptedException
    {
    	selectdatetimepicker.click();
    	Thread.sleep(2000);
    	selectspecificdatetime.click();
    	Thread.sleep(1000);
    	selectspecifictime.click();
    }
    
    public DatePickerPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    
    

}
