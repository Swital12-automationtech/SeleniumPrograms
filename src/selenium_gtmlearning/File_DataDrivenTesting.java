package selenium_gtmlearning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_DataDrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException    
	{
		//try
		//{
		FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Automation\\ExcelSheet\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		/*Sheet s1 = w1.getSheet("login");
		Row r1 = s1.getRow(0);
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue(); */
		String username = w1.getSheet("loginsheet").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		String password = w1.getSheet("loginsheet").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password); 
		//String un = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		//String pw = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys(username);
		WebElement PW = driver.findElement(By.xpath("//input[@name='pass']"));
		PW.sendKeys(password);
		//}
		//catch()
	}

}
