package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * PurchasePage page class : containing all the WebElement present in the class + method to use this WebElement
 */
public class PurchasePage {

	WebDriver driver;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "inputName")
	private WebElement fullName;
	
	@FindBy(how = How.ID, using = "address")
	private WebElement address;
	
	@FindBy(how = How.ID, using = "city")
	private WebElement city;
	
	@FindBy(how = How.ID, using = "state")
	private WebElement state;
	
	@FindBy(how = How.ID, using = "zipCode")
	private WebElement zipCode;
	
	@FindBy(how = How.ID, using = "cardType")
	private WebElement cardType;
	
	@FindBy(how = How.ID, using = "creditCardNumber")
	private WebElement creditCardNumber;
	
	@FindBy(how = How.ID, using = "creditCardMonth")
	private WebElement creditCardMonth;
	
	@FindBy(how = How.ID, using = "creditCardYear")
	private WebElement creditCardYear;
	
	@FindBy(how = How.ID, using = "nameOnCard")
	private WebElement nameOnCard;
	
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement purchaseFlightButton;
	
	public void fillFulltNameText(String name) {
		fullName.sendKeys(name);
	}
	
	public void fillAddress(String add) {
		address.sendKeys(add);
	}
	
	public void fillCity(String city) {
		this.city.sendKeys(city);
	}
	
	public void fillState(String state) {
		this.state.sendKeys(state);
	}
	
	public void fillZipCode(String zipCode) {
		this.zipCode.sendKeys(zipCode);
	}
	
	public void selectCardType(String cardType) {
		Select selectCardType = new Select(this.cardType);
		selectCardType.selectByVisibleText(cardType);
	}
	
	public void fillCreditCardNumber(String ccNumber) {
		creditCardNumber.sendKeys(ccNumber);
	}
	
	public void fillCreditCardMonth(String creditCardMonth) {
		this.creditCardMonth.clear();
		this.creditCardMonth.sendKeys(creditCardMonth);
	}
	
	public void fillCreditCardYear(String creditCardYear) {
		this.creditCardYear.clear();
		this.creditCardYear.sendKeys(creditCardYear);
	}
	
	public void fillNameOnCard(String nameOnCard) {
		this.nameOnCard.sendKeys(nameOnCard);
	}
	
	public void ClickOnPurchaseFlightButton() {
		purchaseFlightButton.click();
	}
}
