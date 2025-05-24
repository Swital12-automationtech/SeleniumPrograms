package dataprovider_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Datasets 
{
	@DataProvider(name = "data1")
	public Object[][] method()
	{
		return new Object[][] {{"shoe"},{"mobile"},{"purse"},{"watch"},{"perfume"}};
		
	}
	@DataProvider(name = "data2")
	public Object[][] method1()
	{
		return new Object[][] {{"TV"},{"bluetooth"},{"charger"},{"fridge"},{"dishwasher"}};
		
	}
	
	@Test(dataProvider = "data2")
	public void Searchproducts(String input)
	{
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(input + Keys.ENTER);
	}
}
