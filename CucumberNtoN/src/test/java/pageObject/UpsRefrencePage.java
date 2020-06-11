package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UpsRefrencePage {
	public WebDriver driver;
	public UpsRefrencePage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	By closeCockies = By.className("close_btn_thick");
	By tracking = By.linkText("Tracking");
	By trackingHistory = By.linkText("Track & Track History");
	By trackByReference = By.id("stApp_btn_refTrack");
	By Package = By.xpath("//label[contains(text(),'Package')]");
	By checkPackage = By.xpath("//input[@id='trkShipmentTypePackage']");
	By freight = By.xpath("//label[contains(text(),'Freight')]");
	By checkFreight = By.xpath("//input[@id='trkShipmentTypeFreight']");
	By mailInnovation = By.xpath("//label[contains(text(),'Mail Innovations')]");
	By checkmailInnovation = By.xpath("//input[@id='trkShipmentTypeMailInnovations']");
	By destinatinCountry = By.xpath("//select[@id='trkDestCountry']");
	
	
	public void clickCloseCockies() {
		driver.findElement(closeCockies).click();
	}
	public void clickTracking() {
		
		driver.findElement(tracking).click();
		
	}
	
	public void clickTrackingHistory() throws Exception{
		driver.findElement(trackingHistory).click();
		Thread.sleep(2000);
	}
	
	public void clickTrackByReference() throws Exception {
		driver.findElement(trackByReference).click();
		Thread.sleep(2000);
	}
	
	public void clickPackage() throws Exception {
		driver.findElement(Package).click();
		Thread.sleep(2000);
	}
	
	public void clickMailInnovation() throws Exception {
		driver.findElement(mailInnovation).click();
		Thread.sleep(2000);
	}
	
	public void clickFreight() throws Exception {
		driver.findElement(freight).click();
		Thread.sleep(2000);
	}
	public WebElement checkPackage() {
		WebElement pack = driver.findElement(checkPackage);
		return pack;
	}
	
	public WebElement checkFreight() {
		WebElement frei = driver.findElement(checkFreight);
		return frei;
	}
	
	public WebElement checkMailInnovation() {
		WebElement mail = driver.findElement(checkmailInnovation);
		return mail;
	}
	
	public WebElement clickDest() {
		WebElement dest = driver.findElement(destinatinCountry);
		return dest;
	}
	
}
