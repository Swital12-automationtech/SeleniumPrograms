package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Signin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountandlist=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement e2=	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		e2.click();
	}

}
