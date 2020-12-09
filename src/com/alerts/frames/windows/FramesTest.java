package com.alerts.frames.windows;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;

public class FramesTest extends BaseTest{
	@Test
public void FrameTest() throws Throwable
{
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    alertsframeswindowspage afwp=new alertsframeswindowspage();
    afwp.clickafwdropbox();
    afwp.clickframes();
    FramesPage fp=new FramesPage();
    fp.FramesTest();
    fp.setfirstframe();
    Thread.sleep(2000);
    fp.setsecondframe();
   // bt.closeBrowser();
}
}
