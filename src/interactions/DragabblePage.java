package interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DragabblePage extends BaseTest {
	
	//simpletab
		@FindBy(xpath="//a[@id='draggableExample-tab-simple']") private WebElement simpletab;
		public WebElement getsimpletab()
		{
			return simpletab;
		}
		
		public void clicksimpletab() throws InterruptedException
		{
			simpletab.click();
			
		}
		//draggable element
		@FindBy(xpath="//div[@id='dragBox']") private WebElement dragbox;
		public WebElement getdragbox()
		{
			return dragbox;
		}
		public void setdragbox() throws InterruptedException
		{
			Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDropBy(dragbox, 150, 80).perform();
			System.out.println("This is simple tab and it is dragging to its respective xoffset and yoffset");
		}
		
		//executing simpletab element into droppable
		public void SimpleTabExecution() throws InterruptedException
		{
			
			simpletab.click();
			
			Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDropBy(dragbox, 150, 80).perform();
			System.out.println("This is simple tab and it is in Draggable dropbox");
			
		}
		//Axis Restriction tab
		@FindBy(xpath="//a[@id='draggableExample-tab-axisRestriction']") private WebElement axisrestrictiontab;
		public WebElement getaxisrestrictiontab()
		{
			return axisrestrictiontab;
		}
		
		public void clickaxisrestrictiontab()
		{
			axisrestrictiontab.click();
		}
		
		
		@FindBy(xpath="//div[@id='restrictedX']") private WebElement restrictX;
		public WebElement getrestrictX()
		{
			return restrictX;
		}
		
		public void setrestrictX() throws InterruptedException
		{

			Actions a=new Actions(driver);
			a.clickAndHold(restrictX).perform();
			Thread.sleep(2000);
			a.dragAndDropBy(restrictX, 80, 0).perform();
			System.out.println("This is restriction tab and it is restrict x axis");
		}
		
		//notacceptable
		@FindBy(xpath="//div[@id='restrictedY']") private WebElement restrictY;
		public WebElement getrestrictY()
		{
			return restrictY;
		}
		
		public void setrestrictY() throws InterruptedException
		{

			Actions a=new Actions(driver);
			a.clickAndHold(restrictY).perform();
			Thread.sleep(2000);
			a.dragAndDropBy(restrictY, 0, 80).perform();
			System.out.println("This is axis restriction tab and it is restrict y axis");
		}
		
	//executing the accept tab elements acceptable and notacceptable (both)
		public void AxisRestrictionExecution() throws InterruptedException
		{
			Thread.sleep(2000);
			axisrestrictiontab.click();
			Actions a=new Actions(driver);
			a.clickAndHold(restrictX).perform();
			Thread.sleep(2000);
			a.dragAndDropBy(restrictX, 80, 0).perform();
			System.out.println("This is restriction tab and it is restrict x axis");
			
			Actions a1=new Actions(driver);
			a1.clickAndHold(restrictY).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(restrictY,0, 80).perform();
			System.out.println("This is axis restriction tab and it is restrict y axis");
			
		}
	
		//Container Restricted tab
		
		@FindBy(xpath="//a[@id='draggableExample-tab-containerRestriction']") private WebElement containerrestrictiontab;
		public WebElement getcontainerrestrictiontab()
		{
			return containerrestrictiontab;
		}
		
		public void clickcontainerrestrictiontab()
		{
			containerrestrictiontab.click();
		}
		
		//contained outerbox
		
		@FindBy(xpath="//div[@id='containmentWrapper']") private WebElement containouterbox;
		public WebElement getcontainouterbox()
		{
			return containouterbox;
		}
		
		public void setcontainouterbox() throws InterruptedException
		{

			
		}
		
		//containwithinbox
		//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']
		@FindBy(xpath="//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']") private WebElement containwithinbox;
		public WebElement getcontainwithinbox()
		{
			return containwithinbox;
		}
		
		public void setcontainwithinbox() throws InterruptedException
		{
			Actions a1=new Actions(driver);
			a1.clickAndHold(containwithinbox).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(containwithinbox,40, 80).perform();
			System.out.println("This is  conatin restriction tab and it is with inbox");
			
		}
		
		//contained within my parent
		
		
		
		@FindBy(xpath="//div[@class='draggable ui-widget-content m-3']//span") private WebElement containwitymyparentbox;
		public WebElement getcontainwitymyparentbox()
		{
			return containwitymyparentbox;
		}
		
		public void setcontainwitymyparentbox() throws InterruptedException
		{
			Actions a1=new Actions(driver);
			a1.clickAndHold(containwitymyparentbox).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(containwitymyparentbox,40, 80).perform();
			System.out.println("This is  conatin restriction tab and it is with in parent");
			
		}
		
		//executing container restricted tab
		public void ContainerRestrictedExecution() throws InterruptedException
		{
			containerrestrictiontab.click();
			Actions a1=new Actions(driver);
			a1.clickAndHold(containwithinbox).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(containwithinbox,40, 80).perform();
			System.out.println("This is  conatin restriction tab and it is with inbox");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy"+ containwithinbox.getLocation());
			
		    //Actions a1=new Actions(driver);
			a1.clickAndHold(containwitymyparentbox).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(containwitymyparentbox,40, 80).perform();
			System.out.println("This is  conatin restriction tab and it is with in parent");
			
			
		}
		
		//Cursor Style tab
		
		@FindBy(xpath="//a[@id='draggableExample-tab-cursorStyle']") private WebElement cursorstyletab;
		public WebElement getcursorstyletab()
		{
			return cursorstyletab;
		}
		
		public void clickcursorstyletab()
		{
			cursorstyletab.click();
		}
		
		@FindBy(xpath="//div[@id='cursorCenter']") private WebElement centercursor;
		public WebElement getcentercursor()
		{
			return centercursor;
		}
		
		public void setcentercursor() throws InterruptedException
		{
			Actions a1=new Actions(driver);
			a1.clickAndHold(centercursor).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(centercursor,200,100).perform();
			System.out.println("This is cursor syle tab and it is center cursor");
			
		}
		
		
		@FindBy(xpath="//div[@id='cursorTopLeft']") private WebElement centercursortopleft;
		public WebElement getcentercursortopleft()
		{
			return centercursortopleft;
		}
		
		public void setcentercursortopleft() throws InterruptedException
		{
			Actions a1=new Actions(driver);
			a1.clickAndHold(centercursortopleft).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(centercursortopleft,0,-120).perform();
			System.out.println("This is  cursor style tab and it is center cursor top left");
			
		}
		
		@FindBy(xpath="//div[@id='cursorBottom']") private WebElement cursorbottom;
		public WebElement getcursorbottom()
		{
			return cursorbottom;
		}
		
		public void setcursorbottom() throws InterruptedException
		{
			Actions a1=new Actions(driver);
			a1.clickAndHold(cursorbottom).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(cursorbottom,100,0).perform();
			System.out.println("This is  cursor style tab and it is cursor bottom");
			
		}
		
		//Executing Cursor Style tab components
		public void CusorStyleExecution() throws InterruptedException
		{
			
			cursorstyletab.click();
			Actions a1=new Actions(driver);
			a1.clickAndHold(centercursor).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(centercursor,200,100).perform();
			System.out.println("This is cursor syle tab and it is center cursor");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy"+ centercursortopleft.getLocation());
			
			a1.clickAndHold(centercursortopleft).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(centercursortopleft,0,-120).perform();   //check properly to required position
			System.out.println("This is  cursor style tab and it is center cursor top left");
			
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy"+ cursorbottom.getLocation());
			
			a1.clickAndHold(cursorbottom).perform();
			Thread.sleep(2000);
			a1.dragAndDropBy(cursorbottom,50,0).perform();  //check properly to required position
			System.out.println("This is  cursor style tab and it is cursor bottom");
			
			
			
		}
		
		@FindBy(xpath="//div[.='Dragabble' and @class='main-header']") private WebElement dragabbleheading;
		public WebElement getdraggableheading()
		{
			return dragabbleheading;
		}

		public void DragabbleTest() throws Throwable
		{
			FileLib flib=new FileLib();
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			wlib.verifyPage(wlib.waitForElementVisibility(dragabbleheading,"Dragabble"),flib.getPropKeyValue(PROPERTY_PATH, "dragabbleTitle"),"DragabblePage");
		}
		
		
		public DragabblePage()
		{
			PageFactory.initElements(driver, this);
		}

	


}
