package global;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DataDriven {
	public WebDriver driver = null;

	@Test
	public void Login() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		Properties property = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Shraddha\\eclipse-workspace\\TestNG\\DataDriven.properties");
		property.load(file);
		
		if(property.getProperty("browser").equals("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(property.getProperty("browser").equals("firefox")){
			driver = new FirefoxDriver();
		}
		else {
			driver = new InternetExplorerDriver();
		}
		driver.get(property.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(property.getProperty("password"));
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).click();
	}

}
