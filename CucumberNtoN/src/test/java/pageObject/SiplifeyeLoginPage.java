package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SiplifeyeLoginPage {
	public WebDriver driver;
	public SiplifeyeLoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	By username = By.xpath("//input[@id='input-e2y3q14fbnc']");
	By password = By.xpath("//input[@type='password'][@id='input-b1cmuc3nte']");
	By login = By.linkText(" Log In");
	
	
	public void userName(String userID) {
		driver.findElement(username).sendKeys(userID);
	}

	public void passWord(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
}
