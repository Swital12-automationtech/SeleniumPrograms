package selenium_gtmlearning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AirIndiaSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.airindia.com/"); // Open Air India website

        Thread.sleep(5000); // Wait for page load (Replace with WebDriverWait in real tests)
driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        // Select "From" City
        selectCity(driver, "Ahmedabad", "originAutoComplete");

        // Select "To" City
        selectCity(driver, "Delhi", "destinationAutoComplete");
    }

    public static void selectCity(WebDriver driver, String cityName, String autoCompleteId) throws InterruptedException {
        // 1️⃣ Locate the Shadow Host for 'From' or 'To' field
        WebElement shadowHost1 = driver.findElement(By.cssSelector("#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-origin-dest-search > ai-origin-destination"));
        SearchContext shadowRoot1 = shadowHost1.getShadowRoot();

        // 2️⃣ Locate the Shadow Host for AutoComplete (Either Origin or Destination)
        WebElement shadowHost2 = shadowRoot1.findElement(By.cssSelector("#" + autoCompleteId));
        SearchContext shadowRoot2 = shadowHost2.getShadowRoot();

        // 3️⃣ Find Input Field inside Shadow DOM and Enter City Name
        WebElement inputField = shadowRoot2.findElement(By.cssSelector("div > div > div.ai-input-wrap > input"));
        inputField.click();
        inputField.sendKeys(cityName);

        // 4️⃣ Wait for Auto-Suggestions to Load
        Thread.sleep(2000); // Use WebDriverWait in real tests

        // 5️⃣ Find the Auto-Suggestion List
        WebElement suggestionList = shadowRoot2.findElement(By.cssSelector("div.ai-autocomplete-suggestions"));

        // 6️⃣ Select the First Matching Suggestion
        List<WebElement> suggestions = suggestionList.findElements(By.cssSelector("div.ai-autocomplete-suggestion"));
        
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().contains(cityName)) { // Match city name
                suggestion.click();
                break;
            }
        }
    }
}
