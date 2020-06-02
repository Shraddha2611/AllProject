package Shraddha.E2Eframework;

	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;		
	import org.testng.ITestListener ;		
	import org.testng.ITestResult ;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReporting;		

	public class Listeners extends Base implements ITestListener						
	{			
		ExtentTest test;
		ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    
		ExtentReports extent = ExtentReporting.getReportObject();
	    @Override		
	    public void onTestStart(ITestResult result) {					
	        // TODO Auto-generated method stub				
			test=extent.createTest(result.getMethod().getMethodName());
			extentTest.set(test);
			}		

	    @Override		
	    public void onStart(ITestContext result) {					
	        // TODO Auto-generated method stub				
	 
	    }		
	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
	    @Override		
	    public void onTestSuccess(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    	extentTest.get().log(Status.PASS, "Test passed");
	    }
	  
	    @Override		
	    public void onTestFailure(ITestResult result) {
	    	extentTest.get().fail(result.getThrowable());
	    	WebDriver driver = null;
	        // TODO Auto-generated method stub			
	    	try {
				driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			}
	    	catch(Exception e) {
	    		
	    	}
	    	String methodName = result.getMethod().getMethodName(); //capture failed testcase method name and store into methodname
	        		try {
	        			extentTest.get().addScreenCaptureFromPath(getSceenshot(methodName,driver), result.getMethod().getMethodName());
				
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }	
	    @Override		
	    public void onFinish(ITestContext result) {					
	        // TODO Auto-generated method stub				
	        		extent.flush();
	    }		
	   
}
