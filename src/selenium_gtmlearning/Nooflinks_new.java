package selenium_gtmlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nooflinks_new {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		List<WebElement> links=	driver.findElements(By.tagName("a"));
		int count=	links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		WebElement link0=			links.get(i);
			String url=				link0.getAttribute("href");
			System.out.println(url);
	}

}
}
