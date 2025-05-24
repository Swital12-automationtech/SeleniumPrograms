package testNg_gtmlearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod 
{

@Test
public void login()
{
	Assert.assertTrue(true);
}

@Test(dependsOnMethods = "login")
public void logout()
{
	
}
}
