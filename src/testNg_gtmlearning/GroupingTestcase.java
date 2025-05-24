package testNg_gtmlearning;

import org.testng.annotations.Test;

public class GroupingTestcase 
{
@Test(groups={"smoke","regression"})
public void testcase1()
{
	
}

@Test(groups={"sanity","regression"})
public void testcase2()
{
	
}

@Test(groups={"smoke","sanity"})
public void testcase3()
{
	
}

@Test(groups={"system","smoke"})
public void testcase4()
{
	
}

@Test(groups={"system","sanity"})
public void testcase5()
{
	
}
}
