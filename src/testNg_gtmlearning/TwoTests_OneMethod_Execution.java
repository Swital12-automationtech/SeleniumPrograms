package testNg_gtmlearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTests_OneMethod_Execution 
{
@BeforeMethod
public void login()
{
	System.out.println("Before Method");
}
@Test()
public void userregistration()
{
	System.out.println("First testcase");
}
@Test(priority=1)
public void edituser()
{
	System.out.println("Second testcase");
}
@AfterMethod
public void logout()
{
	System.out.println("After Method");	
}
}
