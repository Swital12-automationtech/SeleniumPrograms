package dataprovider_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Testdata_Amazon 
{
	@DataProvider(name = "data")
	public Object[][] method()
	{
		Object[][] data = new Object[5][2];
		data[0][0] = "9409044218";
		data[0][1] = "Test@123456";
		data[1][0] = "abc@gmail.com";
		data[1][1] = "Ab@1234";
		data[2][0] = "9409044218";
		data[2][1] = "Ab@1234";
		data[3][0] = "abc@gmail.com";
		data[3][1] = "Test@123456";
		data[4][0] = "testdata";
		data[4][1] = "Ab@1234";
		return data;

	}
@Test(dataProvider = "data")
public void Amazonlogin(String username, String password)
{
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement hoversignin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions a1 =new Actions(driver);
	a1.moveToElement(hoversignin).perform();
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
