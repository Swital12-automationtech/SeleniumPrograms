package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FlipkartAutoSuggestion {
    public static void main(String[] args) {
        // Set up WebDriver for Edge (Ensure msedgedriver.exe is in PATH)
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        try {
            // Open Flipkart
            driver.get("https://www.flipkart.com");

            // Close login popup if present
            try {
                WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
                closeButton.click();
            } catch (Exception e) {
                System.out.println("No login popup displayed.");
            }

            // Locate the search bar and enter "shoe"
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("shoe");

            // Introduce a small delay before waiting for suggestions
            Thread.sleep(2000);  // Temporary fix for slow UI updates

            // Wait for the auto-suggestions to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> suggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class, 'lrtEPN')]//li"))
            );

            // Print and select the last suggestion
            if (!suggestions.isEmpty()) {
                WebElement lastSuggestion = suggestions.get(suggestions.size() - 1);
                System.out.println("Selected suggestion: " + lastSuggestion.getText());
                lastSuggestion.click();
            } else {
                System.out.println("No suggestions found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
