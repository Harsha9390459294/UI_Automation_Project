package PageObjects;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BaseClass {
	
	public ResultsPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	
	@FindBy(xpath = "//span[contains(text(),'Before 6AM')]/parent::span")
	WebElement departureFilter1;
	
	@FindBy(xpath = "//span[contains(text(),'12PM - 6PM')]/parent::span")
	WebElement departureFilter2;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div/div[5]/div/div[2]/label[1]/span")
	WebElement stopsFilter1;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div[1]/div[3]/div[1]/div[2]/div/div[4]/div[1]/span")
	WebElement priceFilter;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div/button")
	WebElement viewFareButton;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div[1]/div[3]/div[2]/div/div[5]/div/div/div[2]/div/span/span/input")
	WebElement bookButton;
	
	
	//ActionMethods
	
	public void applyFilters() throws InterruptedException {
		
		departureFilter1.click();
		departureFilter2.click();
		stopsFilter1.click();
		Thread.sleep(2000);
		
	}
	
	public void BookFlight() throws InterruptedException {
		
		priceFilter.click();
		Thread.sleep(2000);
		viewFareButton.click();
		Thread.sleep(2000);
		bookButton.click();
		Thread.sleep(20000);
		System.out.println("FlightBookingCompleted");
		
		
	}

}
