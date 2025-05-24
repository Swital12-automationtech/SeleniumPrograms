package assignment_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class GoogleAppsYouTubeTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void openYouTubeFromGoogleApps() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on the 9-dot Google Apps menu
        WebElement googleAppsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Google apps']")));
        googleAppsMenu.click();

        // Wait for the Google Apps iframe to appear and switch to it (if necessary)
     /*   try {
            WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@name, 'app')]")));
            driver.switchTo().frame(iframe);
        } catch (Exception e) {
            System.out.println("No iframe detected, continuing...");
        }

        // Click on the YouTube link
        WebElement youtubeLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='YouTube']")));
        youtubeLink.click();

        // Switch back to the default content (if iframe was used)
        driver.switchTo().defaultContent();

        // Wait for YouTube page to load & verify title
        wait.until(ExpectedConditions.titleContains("YouTube"));
        System.out.println("YouTube opened successfully!");
    }*/
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}



