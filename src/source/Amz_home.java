package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_home {
WebDriver driver;
//1.5
@FindBy(id="twotabsearchtextbox")
WebElement search_tf;

public void search_the_product()
{
	search_tf.sendKeys("Shirt");
	search_tf.sendKeys(Keys.ENTER);
}
public Amz_home(WebDriver driver)
{
	  PageFactory.initElements(driver,this);
}
}