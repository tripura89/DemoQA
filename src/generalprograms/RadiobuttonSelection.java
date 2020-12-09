package generalprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobuttonSelection {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline']//label)[1]")).click();
		
		//driver.findElement(By.xpath("//label[.='Yes']/..//input")).click();
	} 
}
