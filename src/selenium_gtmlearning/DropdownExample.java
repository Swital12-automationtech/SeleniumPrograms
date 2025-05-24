package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/"); // Replace with the actual URL
        
        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox")); // Replace with the actual ID
        
        // Create a Select object
        Select dropdown = new Select(dropdownElement);
        
        // Get all options
        List<WebElement> options = dropdown.getOptions();
      //  int optionCount = options.size();
        System.out.println(dropdown.getOptions().size());
        
        // Print all options
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        
        driver.quit();
    }
}
