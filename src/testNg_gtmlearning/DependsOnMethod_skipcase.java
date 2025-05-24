package testNg_gtmlearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod_skipcase 
{
	@Test
	public void login()
	{
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "login")
	public void logout()
	{
		
	}
}
