package elements;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class ValidLogin extends BaseTest
{

	@Test
	public void validlogin() throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
		//wlib.waitForElementVisibility(lp.getloginHeading());
				
		bt.closeBrowser();

	
	}
}
