package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCasesBaseClass {
	
	public static WebDriver driver; ///this method need not be static...however, made static as required for a class in report generation or something...check
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
