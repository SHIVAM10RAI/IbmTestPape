package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class Amazon extends BasePage {

	public Amazon(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	private WebElement Amazon_Logo;
	public WebElement Amazon_Logo() {
		return Amazon_Logo;
	}
	
	@FindBy(xpath="//input[@name='field-keywords']")
	private WebElement SrchTxBx;
	public WebElement SrchTxBx() {
		return SrchTxBx;	
	}
	
	public void productSrc(String psrc) {
		SrchTxBx.sendKeys(psrc);
		SrchTxBx.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@FindBy(xpath="//h3[@style='display:inline-block'] ")
	private WebElement linkTxt;
	public WebElement linkTxt() {
		return linkTxt;
	}
	
	@FindBy(xpath="//h2[text()='Altra Plastic Pendulum Wall Clock (45 cm x 30 cm x 5 cm, Brown)']")
	private WebElement matchPro;
	public WebElement matchPro() {
		return matchPro;
	}
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
   	private WebElement cartLink;
	public WebElement cartLink() {
		return cartLink;
		
	}
	
}	
