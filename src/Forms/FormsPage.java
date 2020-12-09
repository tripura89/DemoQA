package Forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.genericlib.BaseTest;

public class FormsPage extends BaseTest{
@FindBy(xpath="//div[.='Forms']/..") private WebElement formsdropbox;
public WebElement getformsdropbox()
{
	return formsdropbox;
}
public void clickformsdropbox()
{
     formsdropbox.click();
}

public FormsPage()
{
	PageFactory.initElements(driver, this);
}
	
}
