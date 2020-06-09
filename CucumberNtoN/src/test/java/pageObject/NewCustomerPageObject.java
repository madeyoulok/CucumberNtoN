package pageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewCustomerPageObject {

	public WebDriver driver;

	public NewCustomerPageObject(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	By LoginButton = By.id("login");
	By Customers = By.xpath("//span[contains(text(),'Customers')]");
	By AddNewCustomer = By.xpath("//a[@class='btn btn-block btn-primary']");
	By FirstName = By.id("customers_firstname");
	By LastName = By.xpath("//input[@id='customers_lastname']");
	By GenderMale = By.xpath("//div[@class='content-wrapper']//label[1]//input[1]");
	By GenderFemale = By.xpath("//label[2]//input[1]");
	By ProfilePic = By.xpath("//input[@id='newImage']");
	By DOB = By.xpath("//input[@id='customers_dob']");
	By Telephone = By.id("customers_telephone");
	By Fax = By.id("customers_fax");
	By Email = By.xpath("//input[@id='email']");
	By Password = By.xpath("//input[@id='password']");
	By Status = By.className("form-control");
	By StatusActive = By.xpath("//option[contains(text(),'Active')]");
	By StatusInActive = By.xpath("//option[contains(text(),'Inactive')]");
	By SubmitAddCustomer = By.xpath("//button[@class='btn btn-primary']");
	By AddAddres = By.xpath("//button[@class='btn btn-block btn-primary']");
	By Street = By.id("entry_street_address");
	By Zip = By.id("entry_postcode");
	By City = By.xpath("//input[@id='entry_city']");
	By Country = By.xpath("//select[@id='entry_country_id']");
	By DefultShipping = By.xpath("//select[@id='is_default']");
	By No = By.xpath("//option[contains(text(),'No')]");
	By Yes = By.xpath("//option[contains(text(),'Yes')]");
	By AddButton = By.xpath("//button[@id='addAddress']");
	By SaveButton = By.xpath("//select[@id='entry_country_id']");

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void ClickLogin() throws Exception {
		driver.findElement(LoginButton).click();
		Thread.sleep(2000);
	}

	public void ClickOnCustomers() {
		driver.findElement(Customers).click();
	}

	public void AddCustomer() throws Exception {
		Thread.sleep(2000);
		driver.findElement(AddNewCustomer).click();
	}

	public void SetFirstName(String FName) {
		driver.findElement(FirstName).sendKeys(FName);
	}

	public void SetLastName(String LName) {
		driver.findElement(LastName).sendKeys(LName);

	}

	public void SetGender(String gender) {
		if (gender.equals("Male")) {
			driver.findElement(GenderMale).click();
		} else if (gender.equals("Female")) {
			driver.findElement(GenderFemale).click();
		} else {
			driver.findElement(GenderMale).click();
		}
	}

	public void UplodePic() {
		driver.findElement(ProfilePic).sendKeys("C:\\Users\\nahid\\Desktop\\nn.jpg");
	}

	public void DateOfBirth(String dob) {
		driver.findElement(DOB).sendKeys(dob);
	}

	public void SetPhoneNUmber(String phNumber) {
		driver.findElement(Telephone).sendKeys(phNumber);
	}

	public void SetFax(String fax) {
		driver.findElement(Fax).sendKeys(fax);
	}

	public void SetEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}

	public void SetPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}

	public void SetStatus(String status01) {
		driver.findElement(Status).click();
		if (status01.equals("Active")) {
			driver.findElement(StatusActive).click();
		} else if (status01.equals("Inactive")) {
			driver.findElement(StatusInActive).click();
		} else {
			driver.findElement(StatusActive).click();
		}
	}
	public void Submit() throws Exception {
		driver.findElement(SubmitAddCustomer).click();
		Thread.sleep(2000);
	}

	public void ClickAddAddress() {
		driver.findElement(AddAddres).click();
	}

	public void SetStreet(String street) {
		driver.findElement(Street).sendKeys(street);
	}

	public void SetZip(String zip) {
		driver.findElement(Zip).sendKeys(zip);
	}

	public void SetCity(String city) {
		driver.findElement(City).sendKeys(city);
	}

	public void SetCountry(String country) {
		WebElement hh = driver.findElement(Country);
		Select ss = new Select(hh);
		ss.selectByVisibleText(country);
	}
	

	public void SetDefultShipping(String y) throws Exception {
		Thread.sleep(2000);
	    driver.findElement(DefultShipping).click();
	    Thread.sleep(1000);
	    WebElement ee = driver.findElement(No);
	    WebElement rr = driver.findElement(Yes);
		if(y.equals(rr)) {
			driver.findElement(Yes).click();
		}else if(y.equals(ee)) {
			driver.findElement(No).click();
		}else {
			driver.findElement(Yes).click();
		}
		
	}

	public void ClickAddButton() throws Exception {
		Thread.sleep(1000);
		driver.findElement(AddButton).click();
	}



	public void ClickSaveButton() throws Exception {
		Thread.sleep(1000);
		driver.findElement(SaveButton).click();
	}

}
