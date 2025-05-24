package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment115_Locator_Contains_Text {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement hover = driver.findElement(By.xpath("//span[text()= 'Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover).perform();
		WebElement signinbtn = driver.findElement(By.xpath("(//span[text()= 'Sign in'])[1]"));
		signinbtn.click();
		WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'email')]"));
		email.sendKeys("9409044218");
		WebElement cont = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));
		cont.click();
		WebElement pass = driver.findElement(By.xpath("//input[contains(@name , 'password')]"));
		pass.sendKeys("Test@123456");
		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@aria-labelledby, 'auth-signin-button-announce')]"));
		loginbtn.click();
		driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("shoe" +Keys.ENTER);
		
		;
	}

}
