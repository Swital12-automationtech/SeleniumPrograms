package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/Growtechmind/grotechminds.html");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.manage().window().maximize();
        driver.findElement(By.id("1")).sendKeys("abc");

	}

}
