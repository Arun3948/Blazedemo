package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * ReservePage page class : containing all the WebElement present in the class + method to use this WebElement
 */
public class ReservePage {

	WebDriver driver;

	public ReservePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@value='Choose This Flight'])[1]")
	private WebElement firstFlightButton;
	
	public void clickFirstFlightButton() {
		firstFlightButton.click();
	}
}
