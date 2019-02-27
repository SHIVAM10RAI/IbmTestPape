package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GooglePOM extends BasePage {
	
	public GooglePOM(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="q")
	private WebElement srcTxBx;
	public WebElement srcTxBx() {
		return srcTxBx;
		
	}
	public void GoogleSearch (String value) {
		srcTxBx.sendKeys(value);
		srcTxBx.sendKeys(Keys.ENTER);
	}

}
