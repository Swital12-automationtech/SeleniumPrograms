package assignment_listner;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener 
{
	static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		ITestListener.super.onTestStart(result);
		// Step 1
		TakesScreenshot ts = (TakesScreenshot) driver;
		// step 2
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		Date d1 = new Date();
		// step 3
		File f2 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Automation\\Screenshot\\testcasepass" +Math.random()+ ".png");
		try {
			FileHandler.copy(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Testcase is passed");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		// Step 1
		TakesScreenshot ts = (TakesScreenshot) driver;
		// step 2
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		Date d1 = new Date();
		// step 3
		File f2 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Automation\\Screenshot\\testcasefail" +Math.random()+ ".png");
		try {
			FileHandler.copy(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Testcase is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
