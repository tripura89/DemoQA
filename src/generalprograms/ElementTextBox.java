package generalprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextBox {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.findElement(By.id("userName")).sendKeys("Tripura");
	driver.findElement(By.id("userEmail")).sendKeys("tripu123@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("CreeksideDrive,"
			+ "The Falls,"
			+ "Folsom");
	driver.findElement(By.id("permanentAddress")).sendKeys("CreeksideDrive,The Falls, Folsom-95630");
			driver.findElement(By.id("submit")).click();

	}

}
