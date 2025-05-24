package selenium_gtmlearning;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagNameExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement notADropdown = driver.findElement(By.name("q")); // Not a <select>
        Select dropdown = new Select(notADropdown); // Will throw error

        driver.quit();
    }
}


