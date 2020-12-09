package generalprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/books");
		//driver.findElement(By.xpath("(//span[@class='group-header']//div)[10]")).click();
		driver.findElement(By.xpath("//div[.='Forms']/..")).click();
	}

}
