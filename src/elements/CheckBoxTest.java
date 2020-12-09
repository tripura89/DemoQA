package elements;

import org.testng.annotations.Test;

import com.demoqa.element.pages.CheckBoxPom;
import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.element.pages.TextBoxPom;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class CheckBoxTest extends BaseTest{

	@Test
	public void checkBoxTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	ElementPage ep=new ElementPage();
	ep.elementCheckBoxClick();
	CheckBoxPom cbp=new CheckBoxPom();
	cbp.checkBoxTest();
	cbp.checkboxCheck();
	Thread.sleep(2000);
	bt.closeBrowser();
 
}
}
