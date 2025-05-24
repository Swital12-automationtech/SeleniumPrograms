package selenium_gtmlearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=		driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
		
		WebElement e2=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();
		String pid=		driver.getWindowHandle();
		System.out.println(pid);
		Set<String> ids=	driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> i1=				ids.iterator();
					String id1=				i1.next();
					String id2=				i1.next();
					System.out.println(id1);
					System.out.println(id2);
	driver.switchTo().window(id2);

	Thread.sleep(3000);

				driver.close();

	}

}
