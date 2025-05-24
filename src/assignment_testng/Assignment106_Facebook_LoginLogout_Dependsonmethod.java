package assignment_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment106_Facebook_LoginLogout_Dependsonmethod 
{
	WebDriver driver;
	@Test
	public void login()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com"); 
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Switaltest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Abc1232");
		driver.findElement(By.name("login")).click();
	}

	@Test(dependsOnMethods = "login")
	public void logout()
	{
		driver.quit();
	}
}
