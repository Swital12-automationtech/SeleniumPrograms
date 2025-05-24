package assigment_selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment82_Edgelaunch 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String s2 = driver.getTitle();
		System.out.println("Title is: " + s2);
		driver.quit();

	}

}
