package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment89_Hoverover_Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement electronics=	driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(electronics).perform();
		WebElement e2=	driver.findElement(By.linkText("Bluetooth Headphones"));
		e2.click();

	}

}
