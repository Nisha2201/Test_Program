package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.Amz_Login;
import source.Amz_home;


public class Amz_search 
{
	@Test
	public void login_with_valid_credentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.navigate().refresh();
		Amz_Login a1 = new Amz_Login(driver); //remember scanner and actions class
		a1.un();
		a1.un_submit();
		a1.pwd();
		a1.signin();
		
		Amz_home a2 = new Amz_home(driver);
		a2.search_the_product();
	
	}
}
