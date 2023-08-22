package TestCases;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCasesBaseClass {
	
	public WebDriver driver;
	public ResourceBundle rb;
	
	@BeforeClass
	public void setup() throws InterruptedException{
		
		rb = ResourceBundle.getBundle("config");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(rb.getString("appUrl"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown(){

		driver.close();
		
	}
	
	
	

}
