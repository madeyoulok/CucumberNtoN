package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObject.LoginPageObject;
import pageObject.NewCustomerPageObject;

public class ValidLogin extends BaseClass {

	@Given("User open chrome browser")
	public void user_open_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPageObject(driver);
	}

	@When("Go to Url {string}")
	public void go_to_Url(String url) {
		driver.get(url);

	}

	@When("Click on login")
	public void click_on_login() throws Exception {
		lp.clickLogin();
		Thread.sleep(2000);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws Exception {
		lp.setEmail(email);
		Thread.sleep(1000);
		lp.setPassword(password);

	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.clickLoginButton();
	}

	@Then("logout button should be visible")
	public void logout_button_should_be_visible() {
		if (driver.getPageSource().contains("Registered Customers")) {
			driver.close();
		} else {
			lp.assertLogoutButton();

		}

	}

	@When("Click logout button")
	public void click_logout_button() {
		lp.clickLogoutButton();
	}

	// Add New Customer
	@When("Click on Admin login button")
	public void click_on_Admin_login_button() throws Exception {
		addcust = new NewCustomerPageObject(driver);
		Thread.sleep(2000);
		addcust.ClickLogin();

	}

	@Then("User can view Deshbord")
	public void user_can_view_Deshbord() {
		Assert.assertEquals("Admin Panel | Dashboard", addcust.getPageTitle());
	}

	@Then("Click on Customers")
	public void click_on_Customers() {
		addcust.ClickOnCustomers();
	}

	@Then("Click on Add New Customer")
	public void click_on_Add_New_Customer() throws Exception {
		addcust.AddCustomer();
	}

	@Then("User can view Add Customer page")
	public void user_can_view_Add_Customer_page() throws Exception {
		Thread.sleep(2000);
		Assert.assertEquals("Admin Panel | Add Customer", addcust.getPageTitle());

	}

	@Then("User enter customer info")
	public void user_enter_customer_info() throws Exception {

		addcust.SetFirstName("Nabiha");
		addcust.SetLastName("Naisa");
		Thread.sleep(1000);
		addcust.SetGender("Female");
		addcust.UplodePic();

		addcust.DateOfBirth("2020-06-19");
		addcust.SetPhoneNUmber("3474598914");
		addcust.SetFax("1234567");
		String email = randomestring() + "@gmail.com";
		addcust.SetEmail(email);
		addcust.SetPassword("nahid1234");
		Thread.sleep(2000);
		addcust.SetStatus("Inactive");
		Thread.sleep(1000);
		addcust.Submit();

	}

	@Then("User view the Add Adress page")
	public void user_view_the_Add_Adress_page() {
		Assert.assertEquals("Admin Panel | Add Address", addcust.getPageTitle());
	}
	@Then("Click on Add Address Button")
	public void click_on_Add_Address_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User enter Address info")
	public void user_enter_Address_info() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Save Button")
	public void click_on_Save_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

	@When("close browser")
	public void close_browser() {
		// driver.quit();
	}

}
