package testCases;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageClasses.ConfirmationPage;
import pageClasses.HomePage;
import pageClasses.PurchasePage;
import pageClasses.ReservePage;
import utility.TestDataFileReader;
import utility.TestLogs;

public class Module_01 {

	WebDriver driver;
	WebDriverManager obj_WDM;
	PageObjectManager obj_POM;
	public static final Logger logger = Logger.getLogger(TestLogs.class.getName());

	public Module_01() {
//		System.out.println("TC_01");
//		obj_WDM = new WebDriverManager();
//		driver = obj_WDM.getDriver();
//		obj_POM = new PageObjectManager(driver);
	}
	
	@BeforeMethod
	public void preSetup() {
		System.out.println("TC_01");
		obj_WDM = new WebDriverManager();
		driver = obj_WDM.getDriver();
		obj_POM = new PageObjectManager(driver);
		logger.info("************Starting TestCase-1 ************");
	}

	/**
	 * Scenario : Happy flow starting selection of Departure & Destination city till
	 * getting ConfirmationID.
	 */
	@Test
	public void TC_01() {

		logger.info("Defining all the Page class object.");
		HomePage obj_HP = obj_POM.getHomePageObject();
		ReservePage obj_RP = obj_POM.getReservePageObject();
		PurchasePage obj_PP = obj_POM.getPurchasePageObject();
		ConfirmationPage obj_CP = obj_POM.getConfirmationPageObject();
		
		HashMap<String, String> testDataMap = FileReaderManager.getInstance().getTestDataFileReader().getPropertyAsHashMap("Module_01");
		
		logger.info("Selecting city from HomePage");
		obj_HP.selectDepartureCity(testDataMap.get("DepartureCity"));
		obj_HP.selectDestinationCity(testDataMap.get("DestinationCity"));
		obj_HP.clickFindFlightsButton();

		logger.info("Selecting Flight from ReservePage");
		
		obj_RP.clickFirstFlightButton();

		logger.info("Filling information in PurchasePage from Property file");
		obj_PP.fillFulltNameText(testDataMap.get("Name"));
		obj_PP.fillAddress(testDataMap.get("Address"));
		obj_PP.fillCity(testDataMap.get("City"));
		obj_PP.fillState(testDataMap.get("State"));
		obj_PP.fillZipCode(testDataMap.get("ZipCode"));
		obj_PP.selectCardType(testDataMap.get("CardType"));
		obj_PP.fillCreditCardNumber(testDataMap.get("CreditCardNumber"));
		obj_PP.fillCreditCardMonth(testDataMap.get("Month"));
		obj_PP.fillCreditCardYear(testDataMap.get("Year"));
		obj_PP.fillNameOnCard(testDataMap.get("NameOnCard"));
		obj_PP.ClickOnPurchaseFlightButton();

		logger.info("Fetching confirmationID from ConfirmationPage");
		String confirmationID = obj_CP.getConfirmationID();
		System.out.println("Confirmation ID : " + confirmationID);
		logger.info("ConfirmationID : " + confirmationID);
		// obj_WDM.closeDriver();
	}
	
	@AfterMethod
	public void postSetup() {
		logger.info("************ Completed TestCase-1 ************");
		obj_WDM.closeDriver();
	}
}
