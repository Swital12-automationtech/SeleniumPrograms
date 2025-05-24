package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112_Colorfind 
{
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
String s1 = login.getCssValue("background-color");
String s2 = login.getCssValue("color");
System.out.println(s1);
System.out.println(s2);
}
}
