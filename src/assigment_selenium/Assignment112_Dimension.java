package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112_Dimension {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("test@mailinator.com");
		WebElement PW = driver.findElement(By.xpath("//input[@name='pass']"));
		PW.sendKeys("test@132");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		//login.click();
		Dimension d1 = login.getSize();
		int s1 = d1.getHeight();
		int s2 = d1.getWidth();
		System.out.println(s1);
		System.out.println(s2);

	}

}
