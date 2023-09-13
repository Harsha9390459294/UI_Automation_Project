package TestCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCasesBaseClass {
	
	//public static RemoteWebDriver driver; ///this method need not be static...however, made static as required for a class in report generation or something...check
	public static WebDriver driver;
	public ResourceBundle rb;
	
	@BeforeClass
	public void setup() throws InterruptedException, MalformedURLException{
		
		rb = ResourceBundle.getBundle("config");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TechGeek\\Desktop\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setCapability("browserVersion", "116.0");
		
		//URL url = new URL("http://localhost:4444/wd/hub");
		//driver = new RemoteWebDriver(url,chromeOptions);
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(rb.getString("appUrl"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown(){

		driver.close();
		
	}
	
	public String CaptureScreen(String tname) throws IOException{
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timeStamp+".png";
		
		try {
			//FileUtils.copyFile(source, new File(destination));
			//
			//
		}catch(Exception e){
			e.getMessage();
		}
		
		return destination;
		
	}
	
	
	

}
