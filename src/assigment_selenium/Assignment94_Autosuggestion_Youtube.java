package assigment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment94_Autosuggestion_Youtube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("(//input[@name='search_query'])[1]"));
		w1.sendKeys("india");
		Thread.sleep(2000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@role='presentation']"));
		l1.get(l1.size()-6).click();
	}

}
