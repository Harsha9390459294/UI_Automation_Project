package TestCases;

import org.testng.annotations.Test;

import PageObjects.*;

public class AirBooking extends TestCasesBaseClass{
	
	
	HomePage homePage;
	ResultsPage resultsPage;
	
	@Test
	public void tc1_bookCostliestFlight() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.login();
		homePage.inputTripDetails(rb.getString("source"), rb.getString("dest"));
		Thread.sleep(25000);
		resultsPage = new ResultsPage(driver);
		resultsPage.applyFilters();
		resultsPage.BookFlight();
		
		//To add assertions, waits instead of sleep statements etc..
	}

}
