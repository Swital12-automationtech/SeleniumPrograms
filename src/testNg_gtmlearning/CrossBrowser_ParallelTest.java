package testNg_gtmlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_ParallelTest 
{
WebDriver driver;
@Parameters("browser")
@Test
public void testcase1(String nameofbrowser)
{
	if(nameofbrowser.equals("chrome")) 
	{
		driver = new ChromeDriver();
	}
	if(nameofbrowser.equals("firefox")) 
	{
		driver = new FirefoxDriver();
	}
	if(nameofbrowser.equals("edge")) 
	{
		driver = new EdgeDriver();
	}
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}

}
