package widgets;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class SliderTest extends BaseTest{

	@Test
	public void SliderTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	WidgetsPage wp=new WidgetsPage();
	wp.clickwidgetsdropbox();
	Thread.sleep(2000);
	wp.setslider();
	SliderPage sp=new SliderPage();
	sp.SliderTest();
    	
	
	
	}

}
