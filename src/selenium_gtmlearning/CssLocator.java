package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id^='t']")).sendKeys("shoe");
		
	}

}
