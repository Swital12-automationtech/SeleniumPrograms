package assignment_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @Test(groups = "Login")
    public void loginTest() throws InterruptedException {
      //  Thread.sleep(6000);
        try {
			driver.findElement(By.id("nav-link-accountList")).click();
			driver.findElement(By.id("ap_email")).sendKeys("9409044218");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Test@123456");
			driver.findElement(By.id("signInSubmit")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // Thread.sleep(2000);
        //Assert.assertTrue(driver.findElement(By.id("nav-link-accountList")).isDisplayed(), "Login failed");
    }

    @Test(groups = "Search")
    public void searchProductTest() throws InterruptedException {
        try {
			Thread.sleep(3000);
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Laptop");
			searchBox.submit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // Assert.assertTrue(driver.getTitle().contains("Laptop"), "Search failed");
    }

   /* @Test(groups = "Hover", dependsOnGroups = "Search")
    public void hoverOverAccountTest() throws InterruptedException {
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(accountList).perform();
        Thread.sleep(4000);
      //  Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Your Orders']")).isDisplayed(), "Hover failed");
    }*/

    @Test(groups = "Logout")
    public void logoutTest() throws InterruptedException {
    	try {
			loginTest();
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
			actions.moveToElement(accountList).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     //   Assert.assertTrue(driver.findElement(By.id("nav-signin-tooltip")).isDisplayed(), "Logout failed");
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
    	Thread.sleep(3000);
        driver.quit();
    }
}
