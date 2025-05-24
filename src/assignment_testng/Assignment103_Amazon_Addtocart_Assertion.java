package assignment_testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment103_Amazon_Addtocart_Assertion 
{
	@Test
	public void addtocart()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountandlist=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement e2=	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		e2.click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("9409044218");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Test@123456");
		WebElement login = driver.findElement(By.id("auth-signin-button"));
		login.click();
		WebElement e1=		driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
		
		WebElement e3=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e3.click();
		String pid=		driver.getWindowHandle();
		System.out.println(pid);
		Set<String> ids=	driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> i1=				ids.iterator();
					String id1=				i1.next();
					String id2=				i1.next();
		driver.switchTo().window(id2);
		WebElement addcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addcart.click();
		Assert.assertTrue(driver.findElement(By.id("sc-buy-box-ptc-button")).isDisplayed());

		
	}

}
