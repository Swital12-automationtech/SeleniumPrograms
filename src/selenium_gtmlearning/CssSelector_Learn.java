package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CssSelector_Learn 
{
public static void main(String[] args)
{
ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement w1 = driver.findElement(By.cssSelector("input[id^='t']"));
	
	w1.sendKeys("bangalore weather");
}
}
