package assignment_listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner.class)
public class Testcase extends Listner
{
	@Test
	public void login() throws InterruptedException
	{
	driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement accountandlist=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

	Actions a1=new Actions(driver);
	a1.moveToElement(accountandlist).perform();
	Thread.sleep(2000);
	WebElement e2=	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	e2.click();
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("9409044218");
	Thread.sleep(2000);
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	WebElement pwd = driver.findElement(By.id("ap_password"));
	pwd.sendKeys("Test@123456");
	WebElement login = driver.findElement(By.id("auth-signin-button"));
	login.click();
	}

}
