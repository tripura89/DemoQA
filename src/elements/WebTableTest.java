package elements;

import org.testng.annotations.Test;

import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.element.pages.WebTablePom;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class WebTableTest extends BaseTest{
	@Test
	public void webtableTest() throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		System.out.println(flib.getCellData(EXCEL_PATH,"Sheet2",1,0));
		LoginPage lp=new LoginPage();
		lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
		ElementPage ep=new ElementPage();
		WebTablePom wbp=new WebTablePom();
		ep.elementWebTableClick();
		//wbp.webtableTest();
		wbp.eleofWebTable(flib.getCellData(EXCEL_PATH, "Sheet2", 1, 0),flib.getCellData(EXCEL_PATH,"Sheet2", 1, 1),flib.getCellData(EXCEL_PATH, "Sheet2", 1, 2),flib.getCellData(EXCEL_PATH, "Sheet2", 1, 3), flib.getCellData(EXCEL_PATH, "Sheet2", 1, 4), flib.getCellData(EXCEL_PATH, "Sheet2", 1, 5));
		System.out.println(flib.getCellData(EXCEL_PATH,"Sheet2", 1, 4));
	}
}

