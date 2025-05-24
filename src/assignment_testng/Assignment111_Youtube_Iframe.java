package assignment_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment111_Youtube_Iframe 
{
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
        
        WebElement iframe2 = driver.findElement(By.name("app"));
		driver.switchTo().frame(iframe2);
		
		WebElement youtubelink = driver.findElement(By.xpath("//span[.='YouTube']"));
		youtubelink.click();
	}

 /*   @AfterMethod
    public void tearDown() {
        driver.quit();
    }*/
}

