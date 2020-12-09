package com.demoqa.element.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class CheckBoxPom extends BaseTest{
	
	 @FindBy(xpath="//span[.='Home']/..//button[@class='rct-collapse rct-collapse-btn']")private WebElement leftarrow;
     public WebElement getrightarrow() 
     {
    	 
    	 return leftarrow;
     }
     public void clickrightarrow()
     {
    		 leftarrow.click();
    }
     
     
     @FindBy(xpath="//span[.='Desktop']//button[@class='rct-collapse rct-collapse-btn']")private WebElement desktoparrowclick;
     public WebElement getdesktoparrowclick()
     {
    	 return desktoparrowclick;
     }
     public void clickdesktoparrowclick()
     {
    	 desktoparrowclick.click();
     }
     
     @FindBy(xpath="//span[.='Commands']/..//span[@class='rct-checkbox']") private WebElement commandscheckbox;
     public WebElement getcommandscheckbox()
     {
    	 return commandscheckbox;
     }
     public void clickcommandscheckbox()
     {
    	 commandscheckbox.click();
    	 
     }
   @FindBy(xpath="//span[.='Desktop']//button[@class='rct-collapse rct-collapse-btn']")private WebElement closedesktoparrowclick;
   public WebElement getclosedesktoparrowclick()
   {
	   return closedesktoparrowclick;
   }
   public void clickclosedesktoparrowclick()
   {
	   closedesktoparrowclick.click();
   }
   
   //2nd part again click on leftarrow
   @FindBy(xpath="//span[.='Documents']//button[@class='rct-collapse rct-collapse-btn']") private WebElement documentsarrowclick;
   public WebElement getdocumentsarrowclick()
   {
	   return documentsarrowclick;
   }
   public void clickdocumentsarrowclick()
   {
	   documentsarrowclick.click();
   }
   
   @FindBy(xpath="//span[.='WorkSpace']//button[@class='rct-collapse rct-collapse-btn']") private WebElement workspacearrowclick;
   public WebElement getworkspacearrowclick()
   {
	   return workspacearrowclick;
   }
   public void clickworkspacearrowclick()
   {
	   workspacearrowclick.click();
   }
   
   //selecting two checkboxes this time
   @FindBy(xpath="//span[.='Angular']//span[@class='rct-checkbox']") private WebElement angularcheckbox;
   public WebElement getangularcheckbox()
   {
	   return angularcheckbox;
   }
   public void clickangularcheckbox()
   {
	   angularcheckbox.click();
   }
   
   @FindBy(xpath="//span[.='Veu']//span[@class='rct-checkbox']") private WebElement veucheckbox;
   public WebElement getveucheckbox()
   {
	   return veucheckbox;
   }
   public void clickveucheckbox()
   {
	   veucheckbox.click();
   }
   @FindBy(xpath="//span[.='WorkSpace']//button[@class='rct-collapse rct-collapse-btn']") private WebElement closeworkspacearrowclick;
   public WebElement getcloseworkspacearrowclick()
   {
	   return closeworkspacearrowclick;
   }
   public void clickcloseworkspacearrowclick()
   {
	   closeworkspacearrowclick.click();
   }
   
   @FindBy(xpath="//span[.='Office']//button[@class='rct-collapse rct-collapse-btn']") private WebElement officearrowclick;
   public WebElement getofficearrowclick()
   {
	   return officearrowclick;
   }
   public void clickofficearrowclick()
   {
	   officearrowclick.click();
   }
   @FindBy(xpath="//span[.='Public']//span[@class='rct-checkbox']") private WebElement publiccheckbox;
   public WebElement getpubliccheckbox()
   {
	   return publiccheckbox;
   }
   public void clickpubliccheckbox()
   {
	   publiccheckbox.click();
   }
   
   @FindBy(xpath="//span[.='Classified']//span[@class='rct-checkbox']") private WebElement classifiedcheckbox;
   public WebElement getclassifiedcheckbox()
   {
	   return classifiedcheckbox;
   }
   public void clickclassifiedcheckbox()
   {
	   classifiedcheckbox.click();
   }
   @FindBy(xpath="//span[.='General']//span[@class='rct-checkbox']") private WebElement generalcheckbox;
   public WebElement getgeneralcheckbox()
   {
	   return generalcheckbox;
   }
   public void clickgeneralcheckbox()
   {
	   generalcheckbox.click();
	   
   }
   
   //3rd one downloads
   @FindBy(xpath="//span[.='Downloads']//button[@class='rct-collapse rct-collapse-btn']") private WebElement downloadsarrow;
   public WebElement getdownloadsarrow()
   {
	   return downloadsarrow;
   }
   public void clickdownloadsarrow()
   {
	   downloadsarrow.click();
   }
   //This one is not working
   @FindBy(xpath="//span[.='Excel File.doc']//span[@class='rct-checkbox']") private WebElement excelfilecheckbox;
   public WebElement getexcelfilecheckbox()
   {
	   return excelfilecheckbox;
   }
   public void clickexcelfilecheckbox()
   {
	   excelfilecheckbox.click();
   }
   
   
   @FindBy(xpath="//span[.='Home']//span[@class='rct-checkbox']")private WebElement checkboxhome;
   public WebElement getcheckboxhome() 
   {
  	 return checkboxhome;
   }
   
   public void clickcheckboxhome()
   {
  	 checkboxhome.click();
  	 
   }
     @FindBy(xpath="//div[@class='rct-options']//button[@class='rct-option rct-option-expand-all']") private WebElement expandclick;
     public WebElement getexpandclick()
     {
    	 return expandclick;
     }
     public void clickexpandclick()
     {
    	 expandclick.click();
     }
     
     @FindBy(xpath="//button[@class='rct-option rct-option-collapse-all']")private WebElement collapseallclick;
     public WebElement getcollapseallclick()
     {
    	 return collapseallclick;
     }
     public void clickcollapseallclick()
     {
    	 collapseallclick.click();
     }
     
    
     
     @FindBy(xpath="//div[.='Check Box'and @class='main-header']")private WebElement checkboxheading;
     public WebElement getcheckboxheading()
     {
    	 return checkboxheading;
     }
     public void checkBoxTest() throws Throwable
     {
    	FileLib flib=new FileLib();
     	WebDriverCommonLib wlib=new WebDriverCommonLib();
     	wlib.verifyPage(wlib.waitForElementVisibility(checkboxheading,"Check Box"),flib.getPropKeyValue(PROPERTY_PATH, "checkboxTitle"),"CheckBoxPage");
    	 
     }
     
     public void checkboxCheck() throws InterruptedException
     {
    	 leftarrow.click();
    	 Thread.sleep(3000);
    	 desktoparrowclick.click();
    	 Thread.sleep(3000);
    	 commandscheckbox.click();
    	 Thread.sleep(3000);
    	 closedesktoparrowclick.click();
    	 Thread.sleep(3000);
    	 expandclick.click();
    	 Thread.sleep(3000);
    	 collapseallclick.click();
    	 Thread.sleep(2000);
    	 leftarrow.click();
    	 Thread.sleep(3000);
    	 documentsarrowclick.click();
    	 Thread.sleep(3000);
    	 workspacearrowclick.click();
    	 Thread.sleep(3000);
    	 angularcheckbox.click();
    	 Thread.sleep(3000);
    	 veucheckbox.click();
    	 Thread.sleep(3000);
    	 closeworkspacearrowclick.click();
    	 Thread.sleep(3000);
    	 officearrowclick.click();
    	 Thread.sleep(3000);
    	 publiccheckbox.click();
    	 Thread.sleep(3000);
    	 classifiedcheckbox.click();
	     Thread.sleep(3000);
 	    generalcheckbox.click();
  	     Thread.sleep(3000);
  	    officearrowclick.click();
   	      downloadsarrow.click();
  	      Thread.sleep(3000);
    	 excelfilecheckbox.click(); 
    	 Thread.sleep(3000);
    	 collapseallclick.click();
    	 
     }
     
     public CheckBoxPom()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     
     }

    	 
     


