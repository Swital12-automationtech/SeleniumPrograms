package testNg_gtmlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Shadow_DOM 
{
	@Test
	public void shadow()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement accept = driver.findElement(By.xpath("(//button[.='Accept All'])[1]"));
		accept.click();
		String a="return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
		WebElement e1=	(WebElement) driver.executeScript(a);	
		e1.click();
		
	/*	WebElement radiobtn = driver.findElement(By.name("one"));
		radiobtn.click();
		*/
	}
}
	
