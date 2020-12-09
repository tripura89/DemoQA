package widgets;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class AccordianTest extends BaseTest{

	@Test
	public void AccordianTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	WidgetsPage wp=new WidgetsPage();
	wp.clickwidgetsdropbox();
	Thread.sleep(2000);
	wp.setaccordian();
	AccordianPage ap=new AccordianPage();
	ap.AccordianTest();
	ap.setsection1heading();
	Thread.sleep(2000);
	ap.setsection2heading();
	Thread.sleep(2000);
	ap.setsection3heading();
	Thread.sleep(2000);
			
	}
	

}
