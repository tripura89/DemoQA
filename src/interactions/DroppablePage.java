package interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class DroppablePage extends BaseTest{
	//simpletab
	@FindBy(xpath="//a[@id='droppableExample-tab-simple']") private WebElement simpletab;
	public WebElement getsimpletab()
	{
		return simpletab;
	}
	
	public void clicksimpletab() throws InterruptedException
	{
		accepttab.click();
		Thread.sleep(1000);
		simpletab.click();
		
	}
	//draggable element
	@FindBy(xpath="//div[@id='draggable']") private WebElement draggable;
	public WebElement getdraggable()
	{
		return draggable;
	}
	public void setdraggable() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.clickAndHold(draggable).perform();
		Thread.sleep(2000);
		a.dragAndDrop(draggable,droppable).perform();
		System.out.println("This is simple tab and it is dragging to droppable");
	}
	//droppable element
	@FindBy(xpath="//div[@id='droppable']") private WebElement droppable;
	public WebElement getdroppable()
	{
		return droppable;
	}
	public void setdroppable()
	{
	
	}
	//executing simpletab element into droppable
	public void SimpleTabExecution() throws InterruptedException
	{
		accepttab.click();
		Thread.sleep(3000);
		simpletab.click();
		
		Actions a=new Actions(driver);
		a.clickAndHold(draggable).perform();
		Thread.sleep(2000);
		a.dragAndDrop(draggable,droppable).perform();
		System.out.println("This is simple tab and it is dragging to droppable");
		
	}
	
	//div[@class='tab-content']
	@FindBy(xpath="//div[@class='tab-content']") private WebElement contentbox;
	public WebElement getcontentbox()
	{
		return contentbox;
	}
	public void setcontentbox() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.clickAndHold(contentbox).perform();
		Thread.sleep(2000);
		a.dragAndDrop(droppable,contentbox).perform();
		System.out.println("This is drag me from dropped to contentbox ");
		
	
	}
	//Accept tab
	@FindBy(xpath="//a[@id='droppableExample-tab-accept']") private WebElement accepttab;
	public WebElement getaccepttab()
	{
		return accepttab;
	}
	
	public void clickaccepttab()
	{
		accepttab.click();
	}
	
	//div[@class='accept-drop-container']//div[@id='droppable']
	@FindBy(xpath="//div[@class='accept-drop-container']//div[@id='droppable']") private WebElement droppable2;
	public WebElement getdroppable2()
	{
		return droppable2;
	}
	
	@FindBy(xpath="//div[@id='acceptable']") private WebElement acceptable;
	public WebElement getacceptable()
	{
		return acceptable;
	}
	
	public void setacceptable() throws InterruptedException
	{

		Actions a=new Actions(driver);
		a.clickAndHold(acceptable).perform();
		Thread.sleep(2000);
		a.dragAndDrop(acceptable,droppable2).perform();
		System.out.println("This is simple tab and it is dragging to droppable");
	}
	
	//notacceptable
	@FindBy(xpath="//div[@id='notAcceptable']") private WebElement notacceptable;
	public WebElement getnotacceptable()
	{
		return notacceptable;
	}
	
	public void setnotacceptable() throws InterruptedException
	{

		Actions a=new Actions(driver);
		a.clickAndHold(notacceptable).perform();
		Thread.sleep(2000);
		a.dragAndDrop(notacceptable,droppable2).perform();
		System.out.println("This is simple tab and it is dragging to droppable");
	}
	
//executing the accept tab elements acceptable and notacceptable (both)
	public void AcceptTabExecution() throws InterruptedException
	{
		accepttab.click();
			
		Actions a=new Actions(driver);
		a.clickAndHold(acceptable).perform();
		Thread.sleep(2000);
		a.dragAndDrop(acceptable,droppable2).perform();
		System.out.println("This is accept tab and it is accept element to droppable");
		
		//Actions a=new Actions(driver);
		a.clickAndHold(notacceptable).perform();
		Thread.sleep(2000);
		a.dragAndDrop(notacceptable,droppable2).perform();
		System.out.println("This is accept tab and it is notaccept elementto droppable");
		
	}

	//Prevent Propogation
	@FindBy(id="droppableExample-tab-preventPropogation") private WebElement preventprotab;
	public WebElement getpreventprotab()
	{
		return preventprotab;
	}
	
	public void clickpreventprotab() throws InterruptedException
	{
		preventprotab.click();
		
	}
	
	//dragBox
	@FindBy(xpath="//div[@id='dragBox']") private WebElement dragbox;
	public WebElement getdragbox()
	{
		return dragbox;
	}
	
	
	//Outer droppable
	@FindBy(xpath="//div[@id='notGreedyDropBox']") private WebElement outerdroppable;
	public WebElement getouterdroppable()
	{
		return outerdroppable;
	}
	
	
	public void setouterdroppable() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.clickAndHold(dragbox).perform();
		Thread.sleep(2000);
		a.dragAndDrop(dragbox,outerdroppable).perform();
		System.out.println("This is prevent propogation tab and it is dragme element to outerdroppable");
		
	}
		//Inner droppable
		@FindBy(xpath="//div[@id='notGreedyInnerDropBox']") private WebElement innerdroppable;
		public WebElement getinnerdroppable()
		{
			return innerdroppable;
		}	
		public void setinnerdroppable() throws InterruptedException
		{
		Actions a=new Actions(driver);
		a.clickAndHold(dragbox).perform();
		Thread.sleep(2000);
		a.dragAndDrop(outerdroppable,innerdroppable).perform();
		System.out.println("This is prevent propogation tab and it is dragme elementto innerdroppable");
		
	}
		//2nd outer dropbox
		@FindBy(xpath="//div[@id='greedyDropBox']") private WebElement greedydropbox2;
		public WebElement getgreedydropbox2()
		{
			return greedydropbox2;
		}
		
		public void setgreedydropbox2() throws InterruptedException
		{
			Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDrop(innerdroppable,greedydropbox2).perform();
			System.out.println("This is prevent propogation tab and it is innerdroppable elementto greedydropbox2");
			
		}
		
		//2nd innergreedydropbox
		@FindBy(xpath="//div[@id='greedyDropBoxInner']") private WebElement greedydropboxinner2;
		public WebElement getgreedydropboxinner2()
		{
			return greedydropboxinner2;
		}
		
		public void setgreedydropboxinner2() throws InterruptedException
		{
			Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDrop(greedydropbox2,greedydropboxinner2).perform();
			System.out.println("This is prevent propogation tab and it is greedydropbox2 element to greedydropboxinner2");
			
		}
		
//executing prevent propagation elements
		public void PreventPropagationExecution() throws InterruptedException
		{
			preventprotab.click();

			Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDrop(dragbox,outerdroppable).perform();
			System.out.println("This is prevent propogation tab and it is dragme element to outerdroppable");
			
			
			//executing both droppables at a time
			
			//Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDrop(outerdroppable,innerdroppable).perform();
			System.out.println("This is prevent propogation tab and it is dragme(outerdroppable) elementto innerdroppable");
			
			
			//Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDrop(innerdroppable,greedydropbox2).perform();
			System.out.println("This is prevent propogation tab and it is innerdroppable elementto greedydropbox2");
			
			
			//Actions a=new Actions(driver);
			a.clickAndHold(dragbox).perform();
			Thread.sleep(2000);
			a.dragAndDrop(greedydropbox2,greedydropboxinner2).perform();
			System.out.println("This is prevent propogation tab and it is greedydropbox2 element to greedydropboxinner2");
			
		}
		
		//Revert Draggable
		@FindBy(xpath="//a[@id='droppableExample-tab-revertable']") private WebElement revertdraggable;
		public WebElement getrevertdraggable()
		{
			return revertdraggable;
		}
		
		public void clickrevertdraggable() throws InterruptedException
		{
			revertdraggable.click();
			
		}
		//droppable element
		@FindBy(xpath="//div[@id='revertableDropContainer']//div[@id='droppable']") private WebElement droppablerevert;
		public WebElement getdroppablerevert()
		{
				return droppablerevert;
		}
				public void setdroppablerevert()
				{
				
				}
		
		//Will Revert
		
		@FindBy(xpath="//div[@id='revertable']") private WebElement willrevert;
		public WebElement getwillrevert()
		{
			return willrevert;
		}
		public void setwillrevert() throws InterruptedException
		{
			Actions a=new Actions(driver);
			a.clickAndHold(willrevert).perform();
			Thread.sleep(2000);
			a.dragAndDrop(willrevert,droppablerevert).perform();
			System.out.println("This is revert draggable tab and it is willrevert to droppable");
		}
		
		
		//not revertable
		@FindBy(xpath="//div[@id='notRevertable']") private WebElement notrevert;
		public WebElement getnotrevert()
		{
			return notrevert;
		}
		public void setnotrevert() throws InterruptedException
		{
			Actions a=new Actions(driver);
			a.clickAndHold(notrevert).perform();
			Thread.sleep(2000);
			a.dragAndDrop(notrevert,droppablerevert).perform();
			System.out.println("This is revert draggable tab and it is notrevert to droppable");
		}
	
		
//executing revertdraggable
	public void RevertDraggableExecution() throws InterruptedException
	{
		revertdraggable.click();
		
		Actions a=new Actions(driver);
		a.clickAndHold(willrevert).perform();
		Thread.sleep(2000);
		a.dragAndDrop(willrevert,droppablerevert).perform();
		System.out.println("This is revert draggable tab and it is willrevert to droppable");
		
		//Actions a=new Actions(driver);
		a.clickAndHold(notrevert).perform();
		Thread.sleep(2000);
		a.dragAndDrop(notrevert,droppablerevert).perform();
		System.out.println("This is revert draggable tab and it is notrevert to droppable");
		
	}
	
	
	@FindBy(xpath="//div[.='Droppable' and @class='main-header']") private WebElement droppableheading;
	public WebElement getresizableheading()
	{
		return droppableheading;
	}

	public void DroppableTest() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verifyPage(wlib.waitForElementVisibility(droppableheading,"Droppable"),flib.getPropKeyValue(PROPERTY_PATH, "droppableTitle"),"DroppablePage");
	}
	
	
	public DroppablePage()
	{
		PageFactory.initElements(driver, this);
	}

}
