package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver Initializedriver() throws IOException {
		// use properties to globally use of driver

		prop = new Properties();// this file is responsible to pull data from data.properties file
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.properties");

		prop.load(file); // it takes object as an argument to use file

		// mvn test -Dbrowser=chrome
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
			//if (browserName.contains("headless")) {
				//options.addArguments("headless");
		//}
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\src\\main\\java\\resource\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// it waits for 5 second
		return driver;
		
	}
	public String getSceenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destFile));
		return destFile;
	}
}
