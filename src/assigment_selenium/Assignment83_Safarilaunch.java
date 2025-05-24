package assigment_selenium;

import org.openqa.selenium.safari.SafariDriver;

public class Assignment83_Safarilaunch {
	public static void main(String[] args) {
		SafariDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String s3 = driver.getTitle();
		System.out.println("Title is: " + s3);
		driver.quit();

	}
	

}
