package pom_java_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage 
{
    //step 1 : a) Locating each component using @FindBy Annotation
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement loginbutton;
	
	//step 2 : 	b) Creating Separate methods for each component to perform its action
	public void un()
	{
		username.sendKeys("switaltest@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("Ab@123453");
	}
	public void login()
	{
		loginbutton.click();
	}
	//step 3 :	c) Initializing the component using Pagefactory class inside the constructor
	public Fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
