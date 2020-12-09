package com.alerts.frames.windows;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class BrowserWindowsTest extends BaseTest{
	
	@Test
	public void BrowserWindowsTest() throws Throwable {
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	//WebDriverCommonLib wlib=new WebDriverCommonLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	alertsframeswindowspage afwp=new alertsframeswindowspage();
	afwp.clickafwdropbox();
	afwp.clickbrowserwindows();
	BrowserWindowsPage bwp=new BrowserWindowsPage();
	bwp.browserwindowTest();
	bwp.testingtabwindow();
	
	
	}
}
