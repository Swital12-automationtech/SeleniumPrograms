package dataprovider_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_Search_5Products 
{
	@DataProvider(name = "data1")
	public Object[][] method()
	{
		return new Object[][] {{"shoe"},{"mobile"},{"purse"},{"watch"},{"perfume"}};
		
	}
	
	@Test(dataProvider = "data1")
	public void Searchproducts(String input)
	{
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(input + Keys.ENTER);
	}
}

