package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void OpenBrowse() {
		System.setProperty(Chrome_Key, Chrome_Path);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Test_URL);
	}
	
	@AfterMethod
   public void CloseBrowse() {
		
		driver.quit();

	}
}
