package widgets;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;
import com.demoqa.genericlib.FileLib;
import com.demoqa.genericlib.WebDriverCommonLib;

public class SliderPage extends BaseTest{
	@FindBy(xpath="//input[@class='range-slider range-slider--primary']") private WebElement slider;
	public WebElement getslider()
	{
		return slider;
	}
//	public void setslider()
//	{
//		WebElement s = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
//	  //  WebElement sv1 = driver.findElement(By.xpath("//input[@id='sliderValue' and @value='0']"));
//      //  WebElement sv2 = driver.findElement(By.xpath("//input[@id='sliderValue' and @value='34']"));
//		
//	}
//	.per
	@FindBy(xpath="//div[.='Slider' and @class='main-header']") private WebElement sliderheading;
	public WebElement getautocompleteheading()
	{
		return sliderheading;
	}
	
	public void SliderTest() throws Throwable
	{
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
    	wlib.verifyPage(wlib.waitForElementVisibility(sliderheading,"Slider"),flib.getPropKeyValue(PROPERTY_PATH, "sliderTitle"),"SliderPage");
//    	Actions a =new Actions(driver);
//		
//		a.clickAndHold(slider).perform();
//		Thread.sleep(2000);
//		a.dragAndDropBy(slider, -40, 1).perform();
	//a.dragAndDropBy(source, xOffset, yOffset)
	//keyboardActions
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_RIGHT);
	//	Thread.sleep(10000);
	//	r.keyRelease(KeyEvent.VK_RIGHT);
		slider.sendKeys(Keys.ARROW_RIGHT);

		slider.sendKeys(Keys.ARROW_RIGHT);
    	
        slider.sendKeys(Keys.ARROW_RIGHT); //three times it'll press right arrow key
	}
	
	public SliderPage()
	{
		PageFactory.initElements(driver,this);
	}

}
