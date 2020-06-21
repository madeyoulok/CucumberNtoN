package stepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObject.LoginPageObject;
import pageObject.NewCustomerPageObject;
import pageObject.SiplifeyeLoginPage;
import pageObject.UpsRefrencePage;

public class BaseClass {
	public WebDriver driver;
	public LoginPageObject lp;
	public NewCustomerPageObject addcust;
	public UpsRefrencePage rp;
	
	
	//Creating randomString for unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
	    return(generatedString1);
	
	}
}
