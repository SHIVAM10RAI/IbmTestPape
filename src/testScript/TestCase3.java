package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Amazon;
import pom.GooglePOM;

public class TestCase3 extends BaseTest{
public Amazon amazon;

@Test
	public void scenario2(){
		
		GooglePOM googlePo=new GooglePOM(driver);
		googlePo.GoogleSearch("Amazon");
		Amazon amazon=new Amazon(driver);
		WebElement link = amazon.linkTxt();
		link.click();
		WebElement MovToCat = driver.findElement(By.xpath("//span[text()='Category']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(MovToCat).perform();
		WebElement MovToBook = driver.findElement(By.xpath("//span[text()='Books & Audible']"));
		ac.moveToElement(MovToBook).perform();
		WebElement MovToChBook = driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[15]/div[1]/div/a[5]/span"));
		ac.moveToElement(MovToChBook).perform();
		MovToChBook.click();
		driver.findElement(By.xpath("//img[@alt='6-8 yrs']")).click();
		driver.findElement(By.xpath("//div[@class='bxc-grid__column  bxc-grid__column--4-of-12   bxc-grid__column--light']//img[@alt='Story books']")).click();
		driver.findElement(By.xpath("//span[text()='Waiting Is Not Easy!']")).click();
		String mwin = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		
		for (String string : window) 
		{
			
			if (!mwin.equals(string))
			{
				driver.switchTo().window(string).close();
			}
			
		}
		driver.switchTo().window(mwin);
		driver.findElement(By.xpath("//a[@aria-label='Amazon']")).click();
	}
	
}
