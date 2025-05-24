package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment85_JsamApp_Absxpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Growtechmind/grotechminds.html");
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Swits");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("QA Tester");
		WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("Admin$312");
		WebElement fname = driver.findElement(By.xpath("(/html/body/form)[1]/input[1]"));
		fname.sendKeys("Swital");
		WebElement lname = driver.findElement(By.xpath("(/html/body/form)[1]/input[2]"));
		WebElement checkboxboy = driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
		WebElement checkboxgirl = driver.findElement(By.xpath("(/html/body/form)[2]/input[2]"));
		WebElement checkboxbaby = driver.findElement(By.xpath("(/html/body/form)[2]/input[3]"));
		checkboxgirl.click();
		WebElement male = driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		WebElement realocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		realocate.click();
		WebElement relegion = driver.findElement(By.xpath("/html/body/select"));
		Select s1 = new Select(relegion);
		s1.selectByIndex(2);
		WebElement signup = driver.findElement(By.xpath("(/html/body/input)[7]"));
		signup.click();

		
		
	}

}
