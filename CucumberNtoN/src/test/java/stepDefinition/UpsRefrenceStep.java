package stepDefinition;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import pageObject.UpsRefrencePage;

public class UpsRefrenceStep extends BaseClass {

	@When("User open browser")
	public void user_open_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		rp = new UpsRefrencePage(driver);

	}

	@Then("User go to URL {string}")
	public void user_go_to_URL(String url) throws Exception {
		driver.get(url);

		Thread.sleep(2000);
	}

	@Then("User click on Tracking")
	public void user_click_on_Tracking() throws Exception {
		Thread.sleep(2000);
		rp.clickCloseCockies();
		rp.clickTracking();
		Thread.sleep(2000);
	}

	@Then("User click on Track and History")
	public void user_click_on_Track_and_History() throws Exception {
		rp.clickTrackingHistory();
	}

	@Then("User click on Track by Reference")
	public void user_click_on_Track_by_Reference() throws Exception {
		rp.clickTrackByReference();
	}

	@When("User select Freight")
	public void user_select_Freight() throws Exception {
		rp.clickFreight();
	}

	@Then("Freight should be selected")
	public void freight_should_be_selected() {
		Assert.assertTrue(rp.checkFreight().isSelected());
	}

	@When("User select Mail Innovation")
	public void user_select_Mail_Innovation() throws Exception {
		rp.clickMailInnovation();
	}

	@Then("Mail Innovation should be selected")
	public void mail_Innovation_should_be_selected() {
		Assert.assertTrue(rp.checkMailInnovation().isSelected());
	}

	@When("User select Package")
	public void user_select_Package() throws Exception {
		rp.clickPackage();
	}

	@Then("Package should be selected")
	public void package_should_be_selected() {
		Assert.assertTrue(rp.checkPackage().isSelected());
	}

	@When("User select Destination Country or Territory")
	public void user_select_Destination_Country_or_Territory() {
		Select select = new Select(rp.clickDest());
		select.getAllSelectedOptions();
	}

	@Then("User should see all the country listed")
	public void user_should_see_all_the_country_listed() {
		Select select = new Select(rp.clickDest());
		List<WebElement> country = select.getOptions();

		for (int i = 0; i < country.size(); i++) {
			System.out.println(country.get(i).getText());

		}

	}

	@Then("User should see Bangladesh on the dropdown list")
	public void user_should_see_Bangladesh_on_the_dropdown_list() {
		Boolean found = false;

		Select select = new Select(rp.clickDest());
		List<WebElement> alloptions = select.getOptions();
		for (int i = 0; i < alloptions.size(); i++) {
			if (alloptions.get(i).getText().equals("Bangladesh")) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Value exists");
		}
	}

	@Then("User closed browser")
	public void user_closed_browser() {
		driver.quit();
	}

}
