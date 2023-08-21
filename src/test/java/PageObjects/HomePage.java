package PageObjects;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Elements
	
	@FindBy(xpath = "//*[@id=\'root\']/div[1]/div[2]/div[1]/div/div/div[2]/span/span")
	WebElement logInformClose;
	
	@FindBy(xpath = "//div[@class=\'login__tab_wrapper\']")
	WebElement logInTabWrapper;
	
	@FindBy(xpath = "//div[@id=\'root\']//button")
	WebElement logInButton;
	
	@FindBy(xpath = "//div[@data-id='auth-container']//form//input")
	WebElement logInNumberInput;
	
	@FindBy(xpath = "//div[@data-id='auth-container']//form//button")
	WebElement logInNumberSubmit;
	
	
	@FindBy(xpath = "//span[contains(@class,'sc-12foipm-17')][contains(text(),'From')]/parent::div")
	WebElement sourceWrapper;
	
	@FindBy(xpath = "//span[contains(@class,'sc-12foipm-39')][contains(text(),'From')]/following-sibling::input")
	WebElement sourceBox;
	
	@FindBy(xpath = "//span[contains(@class,'sc-12foipm-17')][contains(text(),'To')]/parent::div")
	WebElement destWrapper;
	
	@FindBy(xpath = "//span[contains(@class,'sc-12foipm-39')][contains(text(),'To')]/following-sibling::input")
	WebElement destBox;
	
	@FindBy(xpath = "//span[contains(@class,'sc-12foipm-39')][contains(text(),'Destination')]/following-sibling::input")
	WebElement calenderWrapper;
	
	@FindBy(xpath = "//span[contains(@aria-label,'Next Month')]")
	WebElement calenderNextMonthButton;
	
	@FindBy(xpath = "//span[@role='presentation'][contains(text(),'Done')]")
	WebElement calenderDoneButton;
	
	@FindBy(xpath = "//a[contains(@class,'sc-12foipm-77')][contains(text(),'Done')]")
	WebElement travellorsDoneButton;
	
	@FindBy(xpath = "//div[contains(@class,'sc-12foipm-91')]/span")
	WebElement searchFlightsButton;
	
	//ActionMethods

	public void login() throws InterruptedException {
		
		
		Thread.sleep(2000);
		logInformClose.click();
		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.moveToElement(logInTabWrapper);
//		Thread.sleep(2000);
//		logInButton.click();
//		Thread.sleep(2000);
//		logInNumberInput.sendKeys("9177696489");
//		Thread.sleep(2000);
//		logInNumberSubmit.click();
//		Thread.sleep(2000);
		
		
	}
	
	public void inputTripDetails(String source, String dest) throws InterruptedException {
		
		sourceWrapper.click();
		Thread.sleep(2000);
		sourceBox.sendKeys(source);
		Thread.sleep(2000);	
		List<WebElement> sourceList = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//p/span"));
		for(WebElement item:sourceList) {
			String airport = item.getText();
			if(airport.contains(source)) {
				item.click();
				break;
			}
		}
		Thread.sleep(2000);
		destBox.sendKeys(dest);
		Thread.sleep(2000);	
		List<WebElement> destList = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//p/span"));
		for(WebElement item:destList) {
			String airport = item.getText();
			if(airport.contains(dest)) {
				item.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		calenderNextMonthButton.click();
		calenderNextMonthButton.click();
		calenderNextMonthButton.click();
		Thread.sleep(2000);
		
		Calendar calendar = Calendar.getInstance();
		String today = Integer.toString(calendar.get(calendar.DATE));
		calendar.add(Calendar.MONTH,3);
		String laterMonth = Integer.toString(calendar.get(calendar.MONTH));
		System.out.println(today+" "+ laterMonth);
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for(WebElement day:days) {
			String dayText = day.getText();
			if(dayText.contains(today)&& dayText.contains(laterMonth)) {
			day.click();
			break;
			}
		}
		Thread.sleep(2000);
		calenderDoneButton.click();
		Thread.sleep(2000);
		travellorsDoneButton.click();
		Thread.sleep(2000);
		searchFlightsButton.click();
		Thread.sleep(2000);
		System.out.println("Data submitted successfully");
	}
	
	
	
}
