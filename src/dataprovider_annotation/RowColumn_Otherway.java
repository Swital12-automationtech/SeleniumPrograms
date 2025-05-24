package dataprovider_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RowColumn_Otherway 
{
	@DataProvider(name = "data")
	public Object[][] method()
	{
		Object data[][] = new Object[5][1];
		data[0][0] = "cream";
		data[1][0] = "perfume";
		data[2][0] = "kajal";
		data[3][0] = "foundation";
		data[4][0] = "eyeliner";
		return data;

		
	}
	
	@Test(dataProvider = "data")
	public void Searchproducts(String input)
	{
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(input + Keys.ENTER);
	}
}
