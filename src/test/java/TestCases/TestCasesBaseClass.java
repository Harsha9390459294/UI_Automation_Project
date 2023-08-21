package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCasesBaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException{
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown(){

		driver.close();
		
	}
	
	
	

}
