package com.alerts.frames.windows;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;

public class AlertsTest extends BaseTest{
	

	@Test
public void AlertsTest() throws Throwable
{
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
	alertsframeswindowspage afwp=new alertsframeswindowspage();
	afwp.clickafwdropbox();
	afwp.clickalerts();
	AlertsPage ap=new AlertsPage();
	ap.AlertsTest();
	Thread.sleep(1000);
	ap.testingalerts();
	//bt.closeBrowser();
	
	
	
	
	}
}
