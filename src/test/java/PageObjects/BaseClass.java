package PageObjects;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	

}
