package pom_java_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_java_source.Fb_LoginPage;

public class TestCase1_LoginToFacebook 
{
@Test
public void loginwithcorrectcredentials()
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Fb_LoginPage loginpage = new Fb_LoginPage(driver);
	loginpage.un();
	loginpage.pwd();
	loginpage.login();
}
}
