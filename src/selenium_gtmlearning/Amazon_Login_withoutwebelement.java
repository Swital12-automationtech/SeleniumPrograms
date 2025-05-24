package selenium_gtmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login_withoutwebelement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://na.account.amazon.com/ap/signin?_encoding=UTF8&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.pape.max_auth_age=0&ie=UTF8&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=lwa&openid.assoc_handle=amzn_lwa_na&marketPlaceId=ATVPDKIKX0DER&arb=a0082fa2-f5a8-41cf-964d-53eff54d4baf&language=en_US&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3Da0082fa2-f5a8-41cf-964d-53eff54d4baf%26language%3Den_US&enableGlobalAccountCreation=1&metricIdentifier=amzn1.application.e3b40bcf8dae40e6bf8b197b9b3dec8d&signedMetricIdentifier=b1rnnUP4iinb%2B%2BwjCOWA1f5Y%2B6DlINB%2BDQCz1Q54AtU%3D"); 
		driver.findElement(By.id("ap_email")).sendKeys("Switalmac04@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("ADWe3422");
		driver.findElement(By.id("auth-signin-button")).click();
	}

}
