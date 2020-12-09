package elements;

import org.testng.annotations.Test;

import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LinksPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;

public class LinksTest extends BaseTest{
	
	@Test
	public void LinksTest() throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		LoginPage lp=new LoginPage();
		lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
		ElementPage ep=new ElementPage();
		ep.clicklinksbtn();
		LinksPage lsp=new LinksPage();
		lsp.LinksTest();
		lsp.clickhomelink();
		Thread.sleep(3000);
		lsp.clickhomezlink();
		//bt.closeBrowser();
		
	}

}
