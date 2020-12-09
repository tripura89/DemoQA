package interactions;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DragabbleTest extends BaseTest{

	@Test
	public void DragabbleTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    InterActionsPage iap=new InterActionsPage();
    iap.clickinteractionsdpdx();
    iap.clickdragabble();
    DragabblePage dp=new DragabblePage();
    dp.DragabbleTest();
    dp.SimpleTabExecution();
    dp.AxisRestrictionExecution();
    dp.ContainerRestrictedExecution();
    dp.CusorStyleExecution();

}
}