package interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;

public class InterActionsPage extends BaseTest{
	
	@FindBy(xpath="//div[.='Interactions']/..") private WebElement interactionsdpbx;
		public WebElement getinteractionsdpbx()
		{
			return interactionsdpbx;
		}
		public void clickinteractionsdpdx()
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ interactionsdpbx.getLocation());
		
		interactionsdpbx.click();
		
		}
		
		@FindBy(xpath="//span[.='Sortable']/..") private WebElement sortable;
		public WebElement getsortable()
		{
			return sortable;
		}
		public void clicksortable()
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ sortable.getLocation());
		
		sortable.click();
	    }
		
		@FindBy(xpath="//span[.='Selectable']/..") private WebElement selectable;
		public WebElement getselectable()
		{
			return selectable;
		}
		public void clickselectable()
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ selectable.getLocation());
		
		selectable.click();
	    }

		@FindBy(xpath="//span[.='Resizable']/..") private WebElement resizable;
		public WebElement getresizable()
		{
			return resizable;
		}
		public void clickresizable()
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ resizable.getLocation());
		
		resizable.click();
	    }
		
		@FindBy(xpath="//span[.='Droppable']/..") private WebElement droppable;
		public WebElement getdroppable()
		{
			return droppable;
		}
		public void clickdroppable()
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ droppable.getLocation());
		droppable.click();
	    }
		
		@FindBy(xpath="//span[.='Dragabble']/..") private WebElement dragabble;
		public WebElement getdragabble()
		{
			return dragabble;
		}
		public void clickdragabble()
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ dragabble.getLocation());
		
		dragabble.click();
	    }
		
		public InterActionsPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
}
