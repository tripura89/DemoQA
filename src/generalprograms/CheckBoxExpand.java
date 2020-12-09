package generalprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExpand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/checkbox");
		//arrow
		driver.findElement(By.xpath("(//span[@class='rct-text']//button)[1]")).click();
		Thread.sleep(2000);
		//home checkbox
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		//expand 
		driver.findElement(By.xpath("//div[@class='rct-options']//button[@class='rct-option rct-option-expand-all']")).click();
        Thread.sleep(2000);
		//disclose
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-collapse-all']")).click();
		System.out.println("expand clicked");
	}

}
