package interactions;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ResizableTest extends BaseTest{

	@Test
	public void ResizeableTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    InterActionsPage iap=new InterActionsPage();
    iap.clickinteractionsdpdx();
    iap.clickresizable();
    ResizablePage rp=new ResizablePage();
    rp.ResizableTest();
   
	}
}
