package selenium_gtmlearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

			public static void main(String[] args) throws InterruptedException, IOException {
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
				String link=	link0.getText();
				System.out.println(link);
				verifylink(link);
			}
			    
			}
			static void verifylink(String link) throws IOException 
			{
				try
				{
				URL u1 = new URL(link);
				HttpURLConnection u2 = (HttpURLConnection) u1.openConnection();
				if(u2.getResponseCode() ==200)
				{
					System.out.println("Link is valid");
					System.out.println("The response message is ->" +u2.getResponseMessage());
					System.out.println("The response code is ->" +u2.getResponseCode());

			}
				else
				{
					System.out.println("Link is invalid");
					System.out.println("The response message is ->" +u2.getResponseMessage());
					System.out.println("The response code is ->" +u2.getResponseCode());

		}
				}
				catch(NullPointerException n1)
				{
					System.out.println("Link was null, Exception handling");
				}
				catch(MalformedURLException n2)
				{
					System.out.println("Link was null, Exception handling");
				}

			


	}

}
