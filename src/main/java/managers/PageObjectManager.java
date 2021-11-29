package managers;

import org.openqa.selenium.WebDriver;

import pageClasses.ConfirmationPage;
import pageClasses.HomePage;
import pageClasses.PurchasePage;
import pageClasses.ReservePage;

public class PageObjectManager {

	/**
	 * Defining all the PageClass object.
	 * Below get..... method to get the instance of Page class.
	 */
	private WebDriver driver;
	private HomePage obj_HP;
	private ReservePage obj_RP;
	private PurchasePage obj_PP;
	private ConfirmationPage obj_CP;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePageObject() {
		return (obj_HP == null) ? obj_HP = new HomePage(driver) : obj_HP;
	}
	
	public ReservePage getReservePageObject() {
		return (obj_RP == null) ? obj_RP = new ReservePage(driver) : obj_RP;
	}
	
	public PurchasePage getPurchasePageObject() {
		return (obj_PP == null) ? obj_PP = new PurchasePage(driver) : obj_PP;
	}
	
	public ConfirmationPage getConfirmationPageObject() {
		return (obj_CP == null) ? obj_CP = new ConfirmationPage(driver) : obj_CP;
	}
}
