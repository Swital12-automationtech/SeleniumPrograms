package selenium_gtmlearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interview_nolink_broken {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		
		System.out.println(count);
		for(int i = 0; i<count; i++)
		{
		WebElement link0 = links.get(i);
		String name = link0.getAttribute("href");
		String link = link0.getText();
		System.out.println(name);
		Verifylink(link);
	}
		

}

	 static void Verifylink(String link) throws IOException   {
		 try
		 {
		URL u1 = new URL(link);
		HttpURLConnection u2 = (HttpURLConnection)u1.openConnection();
		if (u2.getResponseCode()>=200)
		{
			System.out.println(u2.getResponseCode());
			System.out.println(u2.getResponseMessage());

		}
		else
		{
			System.out.println(u2.getResponseCode());
			System.out.println(u2.getResponseMessage());
		}
		 }
		catch(MalformedURLException n2)
		{
			System.out.println("message");
		}
		
	}
		 
}