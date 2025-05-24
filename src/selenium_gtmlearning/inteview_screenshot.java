package selenium_gtmlearning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class inteview_screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		TakesScreenshot ts = driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Automation\\Screenshot\\" +Math.random() +".png");
		FileHandler.copy(f1, f2);
		
	}

}
