package elements;

import org.testng.annotations.Test;

import com.demoqa.element.pages.ElementPage;
import com.demoqa.element.pages.LoginPage;
import com.demoqa.element.pages.UploadAndDownloadPom;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;

public class UploadnDownloadTest extends BaseTest{
		@Test
		public void UploadnDownloadTest() throws Throwable {
			BaseTest bt=new BaseTest();
			bt.openBrowser();
			FileLib flib=new FileLib();
			LoginPage lp=new LoginPage();
			lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
			ElementPage ep=new ElementPage();
			ep.elementuploadndownloadclick();
			UploadAndDownloadPom udp=new UploadAndDownloadPom();
			udp.uploadndownloadTest();
			udp.clickdownloadbtn();
			Thread.sleep(3000);
			udp.clickselectafilebtn();
			//bt.closeBrowser();

}
}
