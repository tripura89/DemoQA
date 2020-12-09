package widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DatePickerYearSelectionPage extends BaseTest{
	
//	@FindBy(xpath="//input[@id='datePickerMonthYearInput']") private WebElement selectdatepicker;
//	public WebElement getselectdatepicker()
//	{
//		return selectdatepicker;
//	}
//	public void setselectdatepicker()
//	{
//		selectdatepicker.click();
//	}
	
	@FindBy(xpath="//input[@id='dateAndTimePickerInput']") private WebElement selectdatetimepicker;
	public WebElement getselectdatetimepicker()
	{
		return selectdatetimepicker;
	}
	public void setselectdatetimepicker()
	{
		selectdatetimepicker.click();
	}

	
	@FindBy(xpath="//span[@class='react-datepicker__month-read-view--down-arrow']") private WebElement selectmontharrowpicker;
	public WebElement getselectmontharrowpicker()
	{
		return selectmontharrowpicker;
	}
	public void setselectmontharrowpicker()
	{
		selectmontharrowpicker.click();
	}
	
	@FindBy(xpath="//div[.='November']") private WebElement selectedmonth;
	public WebElement getselectedmonthe()
	{
		return selectedmonth;
	}
	public void setselectedmonth()
	{
		selectedmonth.click();
	}
	
//	@FindBy(xpath="//div[@aria-label='Choose Thursday, November 19th, 2020']") private WebElement selectedmonthdate;
//	public WebElement getselectedmonthdate()
//	{
//		return selectedmonthdate;
//	}
//	public void setselectedmonthdate()
//	{
//		selectedmonthdate.click();
//	}
	
	
	
	
	@FindBy(xpath="//div[@class='react-datepicker__year-read-view']") private WebElement selectyearpicker;
	public WebElement getselecyearpicker()
	{
		return selectyearpicker;
	}
	public void setselectyearpicker()
	{
		selectyearpicker.click();
	}
	
	
	
	@FindBy(xpath="//div[@class='react-datepicker__year-option']//a[@class='react-datepicker__navigation react-datepicker__navigation--years react-datepicker__navigation--years-upcoming']") private WebElement selectingarrowup;
	public WebElement getselectingarrowup()
	{
		return selectingarrowup;
	}
	public void setselectingarrowup()
	{
		selectingarrowup.click();
		selectingarrowup.click();
		selectingarrowup.click();
		selectingarrowup.click();
		selectingarrowup.click();
		
	
	}
	
	@FindBy(xpath="//div[.='2030']") private WebElement selectedyearpicker;
	public WebElement getselectedyearpicker()
	{
		return selectedyearpicker;
	}
	public void setselectedyearpicker()
	{
		selectedyearpicker.click();
	}



	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--019']") private WebElement selectedspecificdatepicker;
	public WebElement getselectedspecificdatepicker()
	{
		return selectedspecificdatepicker;
	}
	public void setselectedspecificdatepicker()
	{
		selectedspecificdatepicker.click();
	}
	
	 @FindBy(xpath="//li[.='17:15']") private WebElement selectspecifictime;
	    public WebElement getselectspecifictime()
	    {
	    	return selectspecifictime;
	    }
	    public void setselectspecifictime()
	    {
	    	selectspecifictime.click();
	    	
	    }
	    
	
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
	
	
	public void SpecificSelectionOfYear() throws InterruptedException
	{
		selectdatetimepicker.click();
		Thread.sleep(2000);
		selectmontharrowpicker.click();
		Thread.sleep(2000);
		selectedmonth.click();
		Thread.sleep(2000);
		//selectedmonthdate.click();
		selectyearpicker.click();
		
		selectingarrowup.click();
		selectingarrowup.click();
		selectingarrowup.click();
		selectingarrowup.click();
		selectingarrowup.click();
		Thread.sleep(2000);
		selectedyearpicker.click();
		Thread.sleep(2000);
		selectedspecificdatepicker.click();
		//selectedmonth.click();
		selectspecifictime.click();
		
	}
	
	public DatePickerYearSelectionPage()
	{
		PageFactory.initElements(driver,this);
	}
	

}
