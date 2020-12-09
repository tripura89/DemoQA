package interactions;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

import widgets.WidgetsPage;

public class SortableTest extends BaseTest{

	@Test
	public void AccordianTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    InterActionsPage iap=new InterActionsPage();
    iap.clickinteractionsdpdx();
    iap.clicksortable();
    SortablePage sp=new SortablePage();
    sp.SortableTest();
    Thread.sleep(2000);
    sp.setlistlink();
    Thread.sleep(2000);
    sp.setgridlink();
    
	}

}
