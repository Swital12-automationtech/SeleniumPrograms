package assigment_selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Screenshot_dateclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/"); 
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Swital");
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("Macwan");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("switaltest@gmail.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("GT4232@#2");
		WebElement paddress = driver.findElement(By.id("Present-Address"));
		paddress.sendKeys("12, shreyas society, alkapuri, vadodara");
		WebElement permanantadd = driver.findElement(By.id("Permanent-Address"));
		permanantadd.sendKeys("arihant society, navrangpura, Ahmedabad");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("423023");
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
		
		//Step 1
		TakesScreenshot ts = driver;
		//step 2
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		Date d1 = new Date();
		//step 3
		File f2 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Automation\\Screenshot\\Pic1" +  d1.getTime() +".png");
		FileHandler.copy(f1, f2);
	}

}
