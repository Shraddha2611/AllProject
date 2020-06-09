import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Cookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize(); //it maximize the window
		//driver.manage().deleteAllCookies(); //delete all cookies
		//driver.manage().deleteCookieNamed("sessionkey");//if we want to delete perticuler cookie

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File ("C:\\Users\\Shraddha\\Documents\\screenshot2.png"));
		
	}

}
