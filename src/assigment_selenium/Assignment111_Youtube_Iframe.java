package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment111_Youtube_Iframe {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.name("callout"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[.='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		WebElement threedoticon = driver.findElement(By.xpath("(//div[@class='gb_D'])[2]"));
		threedoticon.click();
		WebElement youtubelink = driver.findElement(By.xpath("//span[.='YouTube']"));
		youtubelink.click();
	}

}
