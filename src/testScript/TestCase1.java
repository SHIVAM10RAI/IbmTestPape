/**
* The TestCase1 helps Use For Test Amazon Scenario1a Test case
* And output
* @version 3.0
* @author Shivam Rai
*/
package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Amazon;
import pom.GooglePOM;

public class TestCase1 extends BaseTest {
	
	public Amazon amazon;
	@Test
	public void Scenario1a() throws Exception 
	{
		GooglePOM googlePo=new GooglePOM(driver);
		googlePo.GoogleSearch("Amazon");
		amazon=new Amazon(driver);
		WebElement link = amazon.linkTxt();
		link.click();
		//WebElement Exlogo = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
	
		WebElement h = amazon.Amazon_Logo();
		boolean result = h.isDisplayed();
		if(result==true)
		{
		amazon.verify_logo(h);
		System.out.println("************Awsome Logo***********");
		}	
		amazon.productSrc("Altra Plastic Pendulum Wall Clock (45 cm x 30 cm x 5 cm, Brown)");		
		WebElement product = amazon.matchPro();
		String proResult = product.getText();
		System.out.println(proResult);
		amazon.verify_search_result(proResult);
		System.out.println("Same Product");	
		
		//Click On Search Match Product And The Product to cart
		WebElement item = driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		item.click();
		Thread.sleep(2000);
		
		//Shifting Child Window For Add To cart the Item
	    
		Set<String> subWindow = driver.getWindowHandles();
	    for (String string : subWindow) {
			 driver.switchTo().window(string);
		}
	    WebElement cart = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		WebElement Acart = amazon.cartLink();
		amazon.findCartbutton(cart);
		Acart.click();
	    WebElement count = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
	    String actpcountRsut = count.getText();
	    System.out.println(actpcountRsut);
	    String ExpcountRsut="1";
	    Assert.assertEquals(actpcountRsut, ExpcountRsut);
	    {
	    	Reporter.log("Item Is Added To The Cart",true);
	    }
	    Reporter.log("Item Is Added To The Cart",false);
	   	

	} 
}
