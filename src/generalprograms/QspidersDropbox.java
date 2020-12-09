package generalprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QspidersDropbox {

	public static void main(String[] args) throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("qspiders hyderabad");
     Thread.sleep(2000);
    List<WebElement> qspsize = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
     int totalelements = qspsize.size();
     System.out.println(totalelements);
     
     for(int i=0;i<totalelements;i++)
     {
    	String elementtext = qspsize.get(i).getText();
    	System.out.println(elementtext);
    	 
     }
    System.out.println("---------------------------------------------------------");
    // foreach(dummy totalelements:)
     for(WebElement one:qspsize)
     {
    	 System.out.println(one.getText());
     }
     
}

	private static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}