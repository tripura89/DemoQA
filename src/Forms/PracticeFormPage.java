package Forms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class PracticeFormPage extends BaseTest{
	@FindBy(xpath="//span[.='Practice Form']/..") private WebElement practiceformbtn;
	public WebElement getpracticeformbtn()
    {
		return practiceformbtn;
    }
	public void clickpracticeformbtn()
	{
		practiceformbtn.click();
	}
	
	@FindBy(xpath="//div[@class='main-header']") private WebElement practiceformheading;
	public WebElement getpracticeformheading()
	{
		return practiceformheading;
		
	}
	
	 public void PracticeFormTest() throws Throwable {
	    	
	    	FileLib flib=new FileLib();
	    	WebDriverCommonLib wlib=new WebDriverCommonLib();
	    	wlib.verifyPage(wlib.waitForElementVisibility(practiceformheading,"Practice Form"),flib.getPropKeyValue(PROPERTY_PATH, "practiceformTitle"),"PracticeFormPage");
	    	
	    }
	
	@FindBy(id="firstName")	private WebElement firstnametxtbox;
	public WebElement getfirstnametxtbox()
	{
		return firstnametxtbox;
	}
	public void setfirstnametxtbox(String firstname)
	{
	
		firstnametxtbox.sendKeys(firstname);
	}
	
	@FindBy(id="lastName") private WebElement lastnametxtbox;
	public WebElement getnametlastxtbox()
	{
		return lastnametxtbox;
	}
	public void setlastnametxtbox(String lastname)
	{
	
		lastnametxtbox.sendKeys(lastname);
	}
	
	@FindBy(id="userEmail") private WebElement useremailtxtbox;
	public WebElement getuseremailtxtbox()
	{
		return useremailtxtbox;
	}
	public void setuseremailtxtbox(String emailid)
	{
		useremailtxtbox.sendKeys(emailid);
	}
	
    @FindBy(xpath="//label[.='Female']/..") private WebElement femalerdobtn;
    public WebElement getfemalerdobtn()
    {
    	return femalerdobtn;
    }
    public void clickfemalerdobtn()
    {
    	femalerdobtn.click();
    }
    @FindBy(id="userNumber") private WebElement usernumbertxtbox;
    public WebElement getusernumbertxtbox()
    {
    	return usernumbertxtbox;
    }
    public void setusernumbertxtbox(String usernumber)
    {
    	usernumbertxtbox.sendKeys(usernumber);
    	
    }
    
    @FindBy(xpath="//div[@class='react-datepicker__input-container']") private WebElement calendardob;
    public WebElement getcalendardob()
    {
    	return calendardob;
    }
    public void setcalendardob()
    {
    	calendardob.click();
    	//calendardob.sendKeys(dob);
    }
    
    //By using visibleText is not working here
   /* @FindBy(xpath="//select[@class='react-datepicker__year-select']") private WebElement selecteddate;
    public WebElement getselecteddate()
    {
    	return selecteddate;
    }
    public void setselecteddate()
    {
    	selecteddate.click();
    	
    }*/
    @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--009']") private WebElement selectspecificdate;
    public WebElement getselectspecificdate()
    {
    	return selectspecificdate;
    }
    public void setselectspecificdate()
    {
    	selectspecificdate.click();
    }
    @FindBy(xpath="//select[@class='react-datepicker__year-select']//option[@value='2016']") private WebElement selectedyear;
    public WebElement getselectedyear()
    {
    	return selectedyear;
    }
    public void setselectedyear()
    {
    	selectedyear.click();
    }
    
    @FindBy(xpath="//input[@id='subjectsInput']") private WebElement subjectstxtbox;
    public WebElement getsubjectstxtbox()
    {
    	return subjectstxtbox;
    }
    public void setsubjectstxtbox(String subject1)
    {
    	subjectstxtbox.sendKeys(subject1);
    }
    
    @FindBy(xpath="//div[.='Maths']") private WebElement firstsubject;
    public WebElement getfirstsubject()
    {
    	return firstsubject;
    }
    public void setfirstsubject()
    {
    	firstsubject.click();
    }
    
    
    @FindBy(xpath="//div[.='Social Studies']") private WebElement secondsubject;
    public WebElement getsecondsubject()
    {
    	return secondsubject;
    }
    public void setsecondsubject()
    {
    	secondsubject.click();
    }
    //third subject
    @FindBy(xpath="//div[.='Computer Science']") private WebElement thirdsubject;
    public WebElement getthirdsubject()
    {
    	return thirdsubject;
    }
    public void setthirdsubject()
    {
    	thirdsubject.click();
    }
    //fourth subject
    @FindBy(xpath="//div[.='English']") private WebElement fourthsubject;
    public WebElement getfourthsubject()
    {
    	return fourthsubject;
    }
    public void setfourthsubject()
    {
    	fourthsubject.click();
    }
    
    //checkboxes
    @FindBy(xpath="//label[.='Sports']/..") private WebElement sportschkbox;
    public WebElement getsportschkbox()
    {
    	return sportschkbox;
    }
    public void clicksportschkbox()
    {
    	sportschkbox.click();
    }
    
    @FindBy(xpath="//label[.='Reading']/..") private WebElement readingchkbox;
    public WebElement getreadingchkbox()
    {
    	return readingchkbox;
    }
    public void clickreadingchkbox()
    {
    	readingchkbox.click();
    }
    
    @FindBy(xpath="//label[.='Music']/..") private WebElement musicchkbox;
    public WebElement getmusicchkbox()
    {
    	return musicchkbox;
    }
    public void clickmusicchkbox()
    {
    	musicchkbox.click();
    }

@FindBy(xpath="//input[@id='uploadPicture']") private WebElement pictureuploadbtn;
public WebElement getpictureuploadbtn()
{
	return pictureuploadbtn;
}
public void setpictureuploadbtn()
{
	pictureuploadbtn.sendKeys("C:\\Users\\tripu\\Desktop\\38186320_1362768357160230_2940399456257835008_n.jpg");
}

@FindBy(xpath="//div[.='Select State' and @class=' css-yk16xz-control']") private WebElement selectstatedropbox;
public WebElement getselectstatedropbox()
{
	return selectstatedropbox;
}
public void setselectstatedropbox()
{
	selectstatedropbox.click();
		
}
@FindBy(xpath="//select[@class='react-datepicker__month-select']") private WebElement selectmonthdropbox;
public WebElement getselectmonthdropbox()
{
	return selectmonthdropbox;
}
public void setselectmonthdropbox()
{
	selectmonthdropbox.click();
		
}



@FindBy(xpath="//div[.='Uttar Pradesh']") private WebElement selectedstate;
public WebElement getselectedstate()
{
	return selectedstate;
}
public void setselectedstate()
{
	selectedstate.click();
		
}



@FindBy(xpath="//div[.='Select City' and @class=' css-1wa3eu0-placeholder']") private WebElement selectcitydropbox;
public WebElement getselectcitydropbox()
{
	return selectcitydropbox;
}
public void setselectcitydropbox()
{
	selectcitydropbox.click();
}

@FindBy(xpath="//div[.='Agra']") private WebElement selectedcity;
public WebElement getselectedcity()
{
	return selectedcity;
}
public void setselectedcity()
{
	selectedcity.click();
		
}

@FindBy(xpath="//textarea[@id='currentAddress']") private WebElement txtareacurraddr;
public WebElement gettxtarecurraddr()
{
	return txtareacurraddr;
}
public void settxtareacurraddr(String currentaddress)
{
	txtareacurraddr.sendKeys(currentaddress);
}

@FindBy(id="submit") private WebElement submitbtn;
public WebElement getsubmitbtn()
{
	return submitbtn;
}
public void clicksubmitbtn()
{
	submitbtn.click();
}

@FindBy(id="closeLargeModal") private WebElement closebtn;
public WebElement getclosebtn()
{
	return closebtn;
}
public void clickclosebtn()
{
	closebtn.click();
}

public void eleofpracticeform(String firstname, String lastname, String email,String mobilenumber, String dob,String sub1,String sub2,String sub3,String sub4,String currentaddress) throws Throwable {
	
	practiceformbtn.click();
	PracticeFormTest();
	//Thread.sleep(5000);
	firstnametxtbox.sendKeys(firstname);
	lastnametxtbox.sendKeys(lastname);
	useremailtxtbox.sendKeys(email);
	femalerdobtn.click();
	usernumbertxtbox.sendKeys(mobilenumber);
	//calendardob clicking is in set
	calendardob.click();
	Thread.sleep(1000);
	//calendardob.sendKeys(dob); this is for manual passing dob through keyboard
	//select month dropbox is in set
		selectmonthdropbox.click();
	Thread.sleep(2000);
	
	Select smonth=new Select(selectmonthdropbox);
	smonth.selectByVisibleText("May");
	Thread.sleep(2000);
	
	//smonth.selectByVisibleText("2016");  not working through visibletext
	//selected using option value only 
	selectedyear.click();
	Thread.sleep(2000);
	//selected using option value only 
	selectspecificdate.click();
	
	Point loc = sportschkbox.getLocation();
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("window.scrollBy"+loc);
	
	
	subjectstxtbox.sendKeys(sub1);
	Thread.sleep(3000);
	firstsubject.click();
	
	subjectstxtbox.sendKeys(sub2);
	secondsubject.click();
	
	subjectstxtbox.sendKeys(sub3);
	thirdsubject.click();
	Thread.sleep(2000);
	
	subjectstxtbox.sendKeys(sub4);
	fourthsubject.click();
	
	
	
	//checkboxes
	sportschkbox.click();
	readingchkbox.click();
	musicchkbox.click();
	pictureuploadbtn.sendKeys("C:\\Users\\tripu\\Desktop\\38186320_1362768357160230_2940399456257835008_n.jpg");
	
	Point loc1 = txtareacurraddr.getLocation();
	JavascriptExecutor je1=(JavascriptExecutor)driver;
	je.executeScript("window.scrollBy"+loc1);
	txtareacurraddr.sendKeys(currentaddress);
	Thread.sleep(2000);
	selectstatedropbox.click();
	Thread.sleep(2000);
	selectedstate.click();
	Thread.sleep(2000);
	selectcitydropbox.click();
	Thread.sleep(3000);
	selectedcity.click();
	
	
	submitbtn.click();
	Thread.sleep(2000);
	//closebtn.click();  This is for submit popup close btn
}

public PracticeFormPage()
{
	PageFactory.initElements(driver, this);
}
}
