package testNg_gtmlearning;

import org.testng.annotations.Test;

public class InvocationCount_enabled_priority
{
	@Test(invocationCount = 4)
	public void login()
	{
		
	}
	@Test(invocationCount = 2, priority = 2)
	public void logout()
	{
		
	}
	@Test(priority = 3, enabled = false)
	public void registration()
	{
		
	}
	@Test(priority = 1, enabled = true)
	public void useredit()
	{
		
	}
}
