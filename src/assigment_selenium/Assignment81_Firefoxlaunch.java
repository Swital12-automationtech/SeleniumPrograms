package assigment_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment81_Firefoxlaunch {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String s1 = driver.getTitle();
		System.out.println("Title is: " +s1);
		driver.close();


	}

}
