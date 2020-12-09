package interactions;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DroppableTest  extends BaseTest{

	@Test
	public void DroppableTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    InterActionsPage iap=new InterActionsPage();
    iap.clickinteractionsdpdx();
    iap.clickdroppable();
    DroppablePage dp=new DroppablePage();
    dp.DroppableTest();
    dp.SimpleTabExecution();
    Thread.sleep(2000);
    dp.setcontentbox();
    Thread.sleep(2000);
    dp.AcceptTabExecution();
    Thread.sleep(2000);
    dp.PreventPropagationExecution();
    Thread.sleep(2000);
    dp.RevertDraggableExecution();
    
    
	}

}
