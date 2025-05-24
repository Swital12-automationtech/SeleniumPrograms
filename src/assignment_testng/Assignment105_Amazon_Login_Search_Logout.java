package assignment_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment105_Amazon_Login_Search_Logout {
	WebDriver driver;
	@BeforeMethod(alwaysRun = true)
	public void launch()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test(groups = "login")
	public void login()
	{
		Actions a1 = new Actions(driver);
		WebElement accountandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		a1.moveToElement(accountandlist).perform();

		WebElement e2 = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(e2));

		element.click();
		//e2.click();
		WebElement mail = driver.findElement(By.name("email"));
		WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(mail));
		emailField.sendKeys("9409044218");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Test@123456");
		driver.findElement(By.id("auth-signin-button")).click();
	}
	@Test(groups = "search")
	public void searchproduct() {
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe" + Keys.ENTER);
	}
	@Test(groups = {"login", "logout"}, dependsOnMethods = "login")
	public void logout() throws InterruptedException {
		login();
		Actions a1 = new Actions(driver);
		WebElement accountandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		a1.moveToElement(accountandlist).perform();
		WebElement logout = driver.findElement(By.xpath("//span[.='Sign Out']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(logout));
		element3.click();
	}
	@AfterMethod(alwaysRun = true)
	    public void quit() {
	        driver.quit();
	    }

}
