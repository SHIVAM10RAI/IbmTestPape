package library;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
//**************************************FOR SCENARIO 1*****************************************	
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,30);
	}

	public void verify_logo(WebElement verlogo ) {
		try {
			wait.until(ExpectedConditions.visibilityOf(verlogo));
			Reporter.log("Amazon Logo Is Present",true);
		} catch (Exception e) {
			Reporter.log("Amazon Logo Is not Present",true);
		}
	}
    public void verify_Cart_Icon(WebElement verCarticon ) {
    	try {
			wait.until(ExpectedConditions.visibilityOf(verCarticon));
			Reporter.log("Cart Icon Is Present",true);
		} catch (Exception e) {
			Reporter.log("Cart Icon Is not Present",true);
		}
		
	}
   public void verify_search_result(String sresult) {
	   try {
			wait.until(ExpectedConditions.titleContains(sresult));
			Reporter.log("Search Result Is Matched",true);
		} catch (Exception e) {
			Reporter.log("Search Result Is nots Matched",true);
		}
   }
	   public void findCartbutton(WebElement cbutton)
	   {
		   try {
			wait.until(ExpectedConditions.visibilityOf(cbutton));
			Reporter.log("Cart button is present",true);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Cart button is not present",true);
		}
		 
	   }
	   
	 //**************************************FOR SCENARIO 3*****************************************	
  
















}
