package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment83_linktext {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.partialLinkText("Cust")).click();

	}

}
