package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment82_Gtm_Registration_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skill);
		s1.selectByValue("select1");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("Country"));
		Select s2 = new Select(country);
		s2.selectByIndex(3);
		Thread.sleep(2000);
		WebElement relegion = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(relegion);
		s3.selectByVisibleText("Jews");

	}

}
