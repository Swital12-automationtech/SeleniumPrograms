package assignment_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon_LoginLogout_Dependsonmethod 
{
	WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void launch()
    {
    	EdgeDriver driver=new EdgeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	actions =new Actions(driver);
    }
    private WebElement getHoverElement() {
        return driver.findElement(By.xpath("(//span[@class='nav-line-2 ']"));
    }
@Test()
public void login() throws InterruptedException
{
WebElement accountandlist=	getHoverElement();

actions.moveToElement(accountandlist).perform();
WebElement e2=	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
e2.click();
Thread.sleep(2000);
WebElement email = driver.findElement(By.id("ap_email"));
email.sendKeys("9409044218");
WebElement cont = driver.findElement(By.id("continue"));
cont.click();
WebElement pwd = driver.findElement(By.id("ap_password"));
pwd.sendKeys("Test@123456");
WebElement login = driver.findElement(By.id("auth-signin-button"));
login.click();
Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login fails");
}
@Test(dependsOnMethods = "login")
public void logout()
{
	WebElement accountandlist=	getHoverElement();

	actions.moveToElement(accountandlist).perform();
     WebElement logout = driver.findElement(By.xpath("//span[.='Sign Out']"));
     logout.click();
     Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "Login fails");
}
@AfterMethod
public void tearDown() {
    driver.quit();
}

}

