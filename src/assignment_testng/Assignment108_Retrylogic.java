package assignment_testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Assignment108_Retrylogic implements IRetryAnalyzer
{
	int intialcount =0;
	int retrycount =2;

	@Override
	public boolean retry(ITestResult result) {
		if(intialcount<retrycount)
		{
			intialcount++;
			return true;
		}
		return false;
	}

}
