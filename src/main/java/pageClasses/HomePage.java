package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * HomePage page class : containing all the WebElement present in the class + method to use this WebElement
 */
public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "fromPort")
	private WebElement departureCity;
	
	@FindBy(how = How.NAME, using = "toPort")
	private WebElement destinationCity;
	
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement findFlightsButton;
	
	public void selectDepartureCity(String depCity) {
		Select selectDepCity = new Select(departureCity);
		selectDepCity.selectByVisibleText(depCity);
	}
	
	public void selectDestinationCity(String desCity) {
		Select selectDesCity = new Select(destinationCity);
		selectDesCity.selectByVisibleText(desCity);
	}
	
	public void clickFindFlightsButton() {
		findFlightsButton.click();
	}
}
