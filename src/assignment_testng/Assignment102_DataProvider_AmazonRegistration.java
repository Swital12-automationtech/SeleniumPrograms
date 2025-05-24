package assignment_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment102_DataProvider_AmazonRegistration 
{
	@DataProvider(name="data")
	public Object[][] method()
	{
		Object[][] data = new Object[8][3];
		//Set1 : using valid testdata
		data[0][0] = "Swital";
		data[0][1] = "9893294294";
		data[0][2] = "Ab#23242";
		//Set2 : using another valid testdata
		data[1][0] = "Sonal";
		data[1][1] = "8424274289";
		data[1][2] = "Ab@13232";
		//Set3 : using same username testdata
		data[2][0] = "Swital";
		data[2][1] = "8392323823";
		data[2][2] = "Aw21323";
		//Set4 : using same mobile number testdata
		data[3][0] = "Foram";
		data[3][1] = "8392323823";
		data[3][2] = "Test#134";
		//Set5 : using same testdata
		data[4][0] = "Swital";
		data[4][1] = "9893294294";
		data[4][2] = "Ab#23242";
		//Set6 : using blank username testdata
		data[5][0] = "";
		data[5][1] = "8392323823";
		data[5][2] = "Aw21323";
		//Set7 : using blank mobile number testdata
		data[6][0] = "Disney";
		data[6][1] = "";
		data[6][2] = "Aw21323";	
		//Set8 : using blank password testdata
		data[7][0] = "Disney";
		data[7][1] = "8392323823";
		data[7][2] = "";
		return data;
	}
@Test(dataProvider = "data")
public void registration(String name , String mobile , String password)
{
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dap_frn_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mobile);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();

}
}
