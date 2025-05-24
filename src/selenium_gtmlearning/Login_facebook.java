package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com"); 
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Switaltest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Abc1232");
		driver.findElement(By.name("login")).click();

	}

}
