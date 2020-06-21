package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObject.SiplifeyeLoginPage;

public class SimplifeyeLoginStep  {
	public WebDriver driver;
	public SiplifeyeLoginPage simple;

	@When("user open Browser")
	public void user_open_Browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		simple = new SiplifeyeLoginPage(driver);

	}

	@Then("user goes to {string}")
	public void user_goes_to(String url) {
		driver.get(url);

	}

	
	@Then("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String userID, String Pword) throws Exception {
		Thread.sleep(2000);
		simple.userName(userID);
		Thread.sleep(2000);
		simple.passWord(Pword);
	}

	@Then("user enters Login")
	public void user_enters_Login() throws Exception {
		Thread.sleep(2000);
		simple.clickLogin();
	}

}
