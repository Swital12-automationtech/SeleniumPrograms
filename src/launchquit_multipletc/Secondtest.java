package launchquit_multipletc;
//Click on gmail link

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Secondtest extends LaunchQuit 
{
@Test
public void Testcase2()
{
	driver.findElement(By.linkText("Gmail")).click();
}
}
