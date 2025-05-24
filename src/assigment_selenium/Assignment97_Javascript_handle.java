package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment97_Javascript_handle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/"); 
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.xpath("//button[@class='btnjs']"));
		a1.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

	}

}
