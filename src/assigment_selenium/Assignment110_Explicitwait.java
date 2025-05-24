package assigment_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment110_Explicitwait {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement hover = driver.findElement(By.xpath("//span[text()= 'Hello, sign in']"));
		//wait.until(ExpectedConditions.elementToBeSelected(hover));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover).perform();
		wait.until(ExpectedConditions.elementToBeClickable(hover));
		//WebElement signinbtn = driver.findElement(By.xpath("(//span[text()= 'Sign in'])[1]"));
		WebElement signinbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()= 'Sign in'])[1]")));
		signinbtn.click();
		WebElement email = driver.findElement(By.cssSelector("#ap_email"));
		email.sendKeys("9409044218");
		WebElement cont = driver.findElement(By.cssSelector("input[type='submit']"));
		cont.click();
		WebElement pwd = driver.findElement(By.cssSelector("#ap_password"));
		pwd.sendKeys("Test@123456");
		WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
		login.click();	
		wait.until(ExpectedConditions.urlToBe("amazon.in"));

	}

}
