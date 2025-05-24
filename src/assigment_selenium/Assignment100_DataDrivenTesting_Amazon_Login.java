package assigment_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment100_DataDrivenTesting_Amazon_Login {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Automation\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = w1.getSheet("loginsheet").getRow(1).getCell(0).getStringCellValue();
		String password = w1.getSheet("loginsheet").getRow(1).getCell(1).getStringCellValue();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountandlist=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement e2=	driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		e2.click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(username);
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys(password);
				
	}

}
