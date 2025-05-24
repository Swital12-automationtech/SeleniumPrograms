package assigment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment91_Autosuggestion_google {
	@Test
	public void testcase1() throws InterruptedException
	{

	ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.google.com/", "Sorry but please check again");
		WebElement w1 = driver.findElement(By.name("q"));
		w1.sendKeys("bangalore weather");
		Thread.sleep(2000);
		List<WebElement> w2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		w2.get(w2.size()-3).click();
		
		
		

	}

}
