package assigment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment92_Autosuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w1.sendKeys("purse");
		Thread.sleep(2000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
		l1.get(l1.size()-6).click();

	}

}
