package selenium_gtmlearning;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_All_linktext {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://www.amazon.in/");
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



	
