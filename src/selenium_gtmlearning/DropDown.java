package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(w1);
		//s1.selectByIndex(4);
		//s1.selectByValue("search-alias=electronics");
		s1.selectByVisibleText("Amazon Pharmacy");

	}

}
