package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Growtechmind/grotechminds.html");
	WebElement e1=			driver.findElement(By.name("fname"));
	boolean b1=	e1.isEnabled();
	boolean b11=			e1.isDisplayed();	
	
		if(b1==true && b11==true)
		{
			System.out.println("Enabled and displayed");
		}
		else
		{
			System.out.println("Element is either not enabled or displayed");
		}
		WebElement e2=			driver.findElement(By.name("lname"));
		boolean b2=	e2.isEnabled();
		boolean b12=			e2.isDisplayed();	

			if(b2==true && b12==true)
			{
				System.out.println("Enabled and displayed");
			}
			else
			{
				System.out.println("Element is either not enabled or displayed");
			}
	
	
	}

}
