package selenium_gtmlearning;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTab {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");*/
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
		
		
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open();");  // Open new tab

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));  // Switch to new tab

		driver.get("https://www.google.com"); */
	}

}
