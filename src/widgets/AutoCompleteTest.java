package widgets;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class AutoCompleteTest extends BaseTest{

	@Test
	public void AutoCompleteTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	System.out.println(flib.getCellData(EXCEL_PATH,"Sheet4",1,0));
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	WidgetsPage wp=new WidgetsPage();
	wp.clickwidgetsdropbox();
	Thread.sleep(2000);
	wp.setautocomplete();
	AutoCompletePage acp=new AutoCompletePage();
	acp.AutocompleteTest();
	acp.colorslist(flib.getCellData(EXCEL_PATH,"Sheet4",1,0),flib.getCellData(EXCEL_PATH,"Sheet4",1,1),flib.getCellData(EXCEL_PATH,"Sheet4",1,2),flib.getCellData(EXCEL_PATH,"Sheet4",1,3),flib.getCellData(EXCEL_PATH,"Sheet4",1,4), flib.getCellData(EXCEL_PATH,"Sheet4",1,5),flib.getCellData(EXCEL_PATH,"Sheet4",1,6),flib.getCellData(EXCEL_PATH,"Sheet4",1,7),flib.getCellData(EXCEL_PATH,"Sheet4",1,8),flib.getCellData(EXCEL_PATH,"Sheet4",1,8),flib.getCellData(EXCEL_PATH,"Sheet4",1,6));
	//bt.closeBrowser();
	}

}
