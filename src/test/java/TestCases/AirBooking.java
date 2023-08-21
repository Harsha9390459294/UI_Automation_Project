package TestCases;

import org.testng.annotations.Test;

import PageObjects.*;

public class AirBooking extends TestCasesBaseClass{
	
	
	HomePage homePage;
	ResultsPage resultsPage;
	
	@Test
	public void loginApplication() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.login();
		homePage.inputTripDetails("Beng", "Hyd");
		Thread.sleep(25000);
		resultsPage = new ResultsPage(driver);
		resultsPage.applyFilters();
		resultsPage.BookFlight();
		
		//Add assertions, waits instead of sleep statements etc..
	}

}