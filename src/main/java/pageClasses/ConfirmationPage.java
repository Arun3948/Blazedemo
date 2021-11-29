package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * ConfirmationPage page class : containing all the WebElement present in the class + method to use this WebElement
 */
public class ConfirmationPage {

	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//table[@class='table']/tbody/tr/td)[2]")
	private WebElement confirmationID;
	
	public String getConfirmationID() {
		return confirmationID.getText();
	}
}
