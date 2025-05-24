package selenium_gtmlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Slider_Amazon {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.linkText("About Amazon"));
		Point xy = w1.getLocation();
		int x = xy.getX();
		int y = xy.getY();
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0, "+y+")");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0, -400)");

	}

}
