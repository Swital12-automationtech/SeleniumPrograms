package selenium_gtmlearning;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
