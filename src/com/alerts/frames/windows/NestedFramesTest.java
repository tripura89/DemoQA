package com.alerts.frames.windows;



import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;

public class NestedFramesTest extends BaseTest{
	@Test
public void NestedFrameTest() throws Throwable
{
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    alertsframeswindowspage afwp=new alertsframeswindowspage();
    afwp.clickafwdropbox();
    afwp.clicknestedframes();
    NestedFramesPage nfp=new NestedFramesPage();
    nfp.NestedFramesTest();
    nfp.setnested1stframe();
    Thread.sleep(2000);
    nfp.setnested2ndframe();
    
}

}
