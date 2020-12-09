package elements;


import org.testng.annotations.Test;

import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.element.pages.TextBoxPom;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class TestBoxTest extends BaseTest{
	
	@Test
	public void testBoxTest() throws Throwable {
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	System.out.println(flib.getCellData(EXCEL_PATH,"Sheet1",1,0));
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	ElementPage ep=new ElementPage();
	TextBoxPom tbp=new TextBoxPom();
	ep.elementClick();
	Thread.sleep(2000);
    tbp.testBoxTest();
    tbp.eleoftxtbox(flib.getCellData(EXCEL_PATH,"Sheet1",1,0),flib.getCellData(EXCEL_PATH,"Sheet1",1,1),flib.getCellData(EXCEL_PATH,"Sheet1",1,2),flib.getCellData(EXCEL_PATH,"Sheet1",1,3));
   
   
    bt.closeBrowser();
}
}