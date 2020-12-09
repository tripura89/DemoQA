package Forms;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class PracticeFormTest extends BaseTest{
	
	@Test
	public void PracticeFormTest() throws Throwable {
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	System.out.println(flib.getCellData(EXCEL_PATH,"Sheet3",1,0));
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    FormsPage fp=new FormsPage();
    fp.clickformsdropbox();
    PracticeFormPage pfp=new PracticeFormPage();
//    pfp.PracticeFormTest();
    pfp.eleofpracticeform(flib.getCellData(EXCEL_PATH,"Sheet3",1,0),flib.getCellData(EXCEL_PATH,"Sheet3",1,1),flib.getCellData(EXCEL_PATH,"Sheet3",1,2),flib.getCellData(EXCEL_PATH,"Sheet3",1,3),flib.getCellData(EXCEL_PATH,"Sheet3",1,4),flib.getCellData(EXCEL_PATH,"Sheet3",1,5),flib.getCellData(EXCEL_PATH,"Sheet3",1,6),flib.getCellData(EXCEL_PATH, "Sheet3", 1, 7),flib.getCellData(EXCEL_PATH,"Sheet3",1,8),flib.getCellData(EXCEL_PATH,"Sheet3",1,9));
    //bt.closeBrowser();
	}
	
}
