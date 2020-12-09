package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DatePickerThroughExcelPage extends BaseTest{
	
	@FindBy(xpath="//input[@id='datePickerMonthYearInput']") private WebElement selectdatepicker;
	public WebElement getselectdatepicker()
	{
		return selectdatepicker;
	}
	public void setselectdatepicker(String date)
	{
		selectdatepicker.clear();
		selectdatepicker.sendKeys(date);
	}
	
	

	/*@FindBy(xpath="//div[.='25']") private WebElement selectspecificdate;
    public WebElement getselectspecificdate()
    {
    	return selectspecificdate;
    }
    public void setselectspecificdate(String date)
    {
    	selectspecificdate.sendKeys(date);
    }*/
    
    @FindBy(xpath="//div[.='Date Picker' and @class='main-header']") private WebElement datepickerheading;
    public WebElement getdatepickerheading()
    {
    	return datepickerheading;
    }
    
    public void DatePickerTest() throws Throwable {
    	FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(datepickerheading,"Date Picker"),flib.getPropKeyValue(PROPERTY_PATH, "datepickerTitle"),"DatePickerPage");
    	
    }
    
    @FindBy(xpath="//input[@id='dateAndTimePickerInput']") private WebElement selectdatetimepicker;
	public WebElement getselectdatetimepicker()
	{
		return selectdatetimepicker;
	}
	public void setselectdatetimepicker(String datetime1)
	{
		selectdatetimepicker.clear();
		selectdatetimepicker.sendKeys(datetime1);
	}
	
/*	@FindBy(xpath="//div[@aria-label='Choose Friday, October 2nd, 2020']") private WebElement selectspecificdatetime;
    public WebElement getselectspecificdatetime()
    {
    	return selectspecificdatetime;
    }
    public void setselectspecificdatetime(String date, String time)
    {
    	selectspecificdatetime.sendKeys(date,time);
    	
    }*/
	
	public void SendDateThroughExcel(String date,String datetime1) throws InterruptedException {
		
		selectdatepicker.clear();
		selectdatepicker.sendKeys(date);
		Thread.sleep(2000);
		selectdatetimepicker.clear();
		selectdatetimepicker.sendKeys(datetime1);
		
	}
    
    
    
    
    public DatePickerThroughExcelPage()
    {
    	PageFactory.initElements(driver, this);
    	}

}
