package elements;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demoqa.element.pages.ButtonsPom;
import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;


public class ButtonsTest  extends BaseTest{

	@Test
	public void ButtonsTest() throws Throwable {
		
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	ElementPage ep=new ElementPage();
	ep.elementbuttonsclick();
	ButtonsPom bp=new ButtonsPom();
	bp.buttonsTest();
	Thread.sleep(2000);
	bp.buttonactions();
	bt.closeBrowser();
	
	
	
	
	
	
	
	
	
	}

}
