package shraddha.Extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Demo {
	ExtentReports extent;
	@BeforeTest
	public void ExtenetReport() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Tests Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shraddha");
	}
	
	@Test
	public void display() {
		
		extent.createTest("Display Test");
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gtu.ac.in/");
		System.out.println(driver.getTitle());
		extent.flush();
	}
}
//String path =System.getProperty("user.dir")+"\\reports\\index.html";

