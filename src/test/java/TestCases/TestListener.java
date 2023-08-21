package TestCases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Started");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successfully executed");
	  }
	
	public void onTestFailure(ITestResult result) {
	    // not implementedHHHHHHH Implement the method to take the screenshots
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	  }
	
	
	
	
	
	

}
