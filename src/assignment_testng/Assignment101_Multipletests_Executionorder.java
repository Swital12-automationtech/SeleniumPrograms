package assignment_testng;

import org.testng.annotations.Test;

public class Assignment101_Multipletests_Executionorder 
{
@Test
public void login()
{
	System.out.println("Login Testcase");
}
@Test
public void searchproduct()
{
	System.out.println("Search product Testcase");
}
@Test
public void logout()
{
	System.out.println("Logout Testcase");
}

}
