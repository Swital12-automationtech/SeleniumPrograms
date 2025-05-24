package launchquit_multipletc;
//type India and press enter button

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Firsttest extends LaunchQuit
{
	@Test
	public void Testcase1()
	{
		driver.findElement(By.name("q")).sendKeys("India" + Keys.ENTER);
	}
}
