package assignment_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment104_Amazon_LoginLogout_Assertion 
{
@Test
public void loginlogout() throws InterruptedException
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a1=new Actions(driver);

	WebElement accountandlist=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
	a1.moveToElement(accountandlist).perform();
	WebElement e2=	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	e2.click();
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("9409044218");
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	WebElement pwd = driver.findElement(By.id("ap_password"));
	pwd.sendKeys("Test@123456");
	WebElement login = driver.findElement(By.id("auth-signin-button"));
	login.click();
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login fails");
	Thread.sleep(5000);
	accountandlist=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	a1.moveToElement(accountandlist).perform();
	WebElement logout = driver.findElement(By.xpath("//span[.='Sign Out']"));
	logout.click();
	Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "Login fails");

}
}
