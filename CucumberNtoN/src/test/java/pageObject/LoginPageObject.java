package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	public WebDriver driver;
	public LoginPageObject(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[@class='nav-link -before']")
	@CacheLookup
	WebElement login;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//button[@class='btn btn-dark']")
	@CacheLookup
	WebElement LoginButton;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement logoutButton;
	
	
	public void clickLogin() {
		login.click();
	}
	
	public void setEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		Password.sendKeys(password);
		
	}
	public void clickLoginButton() {
		LoginButton.click();
		
	}
	public void assertLogoutButton() {
		boolean aa = logoutButton.isDisplayed();
		Assert.assertTrue(aa);
	}
	public void clickLogoutButton() {
		logoutButton.click();
	}
	
}
