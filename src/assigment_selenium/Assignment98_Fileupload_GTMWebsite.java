package assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment98_Fileupload_GTMWebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/"); 
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Swital");
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("Macwan");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("switaltest@gmail.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("GT4232@#2");
		WebElement paddress = driver.findElement(By.id("Present-Address"));
		paddress.sendKeys("12, shreyas society, alkapuri, vadodara");
		WebElement permanantadd = driver.findElement(By.id("Permanent-Address"));
		permanantadd.sendKeys("arihant society, navrangpura, Ahmedabad");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("423023");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//input[@id='Female']"));
		gender.click();
		Thread.sleep(2000);
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skill);
		s1.selectByValue("select1");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("Country"));
		Select s2 = new Select(country);
		s2.selectByIndex(3);
		Thread.sleep(2000);
		WebElement relegion = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(relegion);
		s3.selectByVisibleText("Jews");
		WebElement fileupload = driver.findElement(By.id("file"));
		fileupload.sendKeys("E:\\Growtechmind\\PCR15_15H150B_SMLSS_SQ.jfif");
		Thread.sleep(2000);
		//WebElement realocate = driver.findElement(By.id("relocate"));
		//realocate.click();

	}

}
