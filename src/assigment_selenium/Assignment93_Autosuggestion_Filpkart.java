package assigment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment93_Autosuggestion_Filpkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.name("q"));
		w1.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> l1 = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		System.out.println(l1.size());
		l1.get(6).click();

	}

}
