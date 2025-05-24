package assigment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment95_Autosuggestion_Apollo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-placeholder='Search Medicines']")).click();
		WebElement w1 = driver.findElement(By.xpath("//input[@id='searchProduct']"));
		w1.sendKeys("Paracetamol");
		Thread.sleep(2000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		l1.get(0).click();
	}

}
