package selenium_gtmlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_googlepage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.name("q"));
		w1.sendKeys("India post");
		Thread.sleep(2000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		e2.get(e2.size()-8).click();
	}

}
