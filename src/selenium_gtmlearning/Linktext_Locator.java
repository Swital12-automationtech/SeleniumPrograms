package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Locator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
	}

}
