//done by me 

package source;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Login{
WebDriver driver;
	//1.location each component using findby annotation
	@FindBy(name ="email")
	WebElement username;
	
	@FindBy(id ="continue") 
	WebElement submit;
	
	@FindBy(name ="password") 
	WebElement password;
	
	@FindBy(id ="signInSubmit") 
	WebElement signin_button;
	
	
	//2.Creating the method for each component to perform action
	
	public void un()
	{
		username.sendKeys("nishasbhalwal@gmail.com");

	}
	public void un_submit()
	{
		submit.click();

	}
	public void pwd()
	{
																																				password.sendKeys("subbu0707");

	}
	public void signin()
	{
		signin_button.click();

	}
	
	//3. initialing each component using page factory class
public Amz_Login(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	
	
	}







}

