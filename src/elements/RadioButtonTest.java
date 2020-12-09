package elements;

import org.testng.annotations.Test;

import com.demoqa.element.pages.CheckBoxPom;
import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.element.pages.RadioButtonPom;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class RadioButtonTest  extends BaseTest{

	@Test
	public void radioButtonTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	ElementPage ep=new ElementPage();
	ep.elementRadioButtonClick();
	RadioButtonPom rbp=new RadioButtonPom();
	rbp.radioButtonTest();
	Thread.sleep(4000);
	rbp.radioButtonClick();
//	rbp.clicknoradiobtn();
	Thread.sleep(2000);
	bt.closeBrowser();
	}

}
