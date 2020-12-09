package widgets;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DatePickerThroughExcelTest extends BaseTest{

	@Test
	public void DatePickerThroughExcelTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	System.out.println(flib.getCellData(EXCEL_PATH,"Sheet5",1,0));
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	WidgetsPage wp=new WidgetsPage();
	wp.clickwidgetsdropbox();
	Thread.sleep(2000);
	wp.setdatepicker();
	DatePickerThroughExcelPage dpte=new DatePickerThroughExcelPage();
	dpte.DatePickerTest();
	Thread.sleep(2000);
	dpte.SendDateThroughExcel(flib.getCellData(EXCEL_PATH,"Sheet5",1,0),flib.getCellData(EXCEL_PATH,"Sheet5",1,1));
	
	
}
}