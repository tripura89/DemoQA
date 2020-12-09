package com.alerts.frames.windows;

import org.testng.annotations.Test;

import com.demoqa.element.pages.LoginPage;
import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;

public class ModalDialogsTest  extends BaseTest{
	@Test
public void ModalDialogsTest() throws Throwable
{
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	FileLib flib=new FileLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
    alertsframeswindowspage afwp=new alertsframeswindowspage();
    afwp.clickafwdropbox(); 
    afwp.clickmodaldialogs();
    ModalDialogsPage mdp=new ModalDialogsPage();
    mdp.ModalDialogsTest();
    mdp.setsmallmodalbtn();
    mdp.setclosesmallmodalbtn();
    Thread.sleep(2000);
    mdp.setlargemodalbtn();
    mdp.setcloselargemodalbtn();
    //bt.closeBrowser();
    
}

}
