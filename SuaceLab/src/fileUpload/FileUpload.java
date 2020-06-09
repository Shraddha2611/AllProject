package fileUpload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", path);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.xpath("//span[contains(text(),'Select PDF files')]")).click();
		Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\Shraddha\\Documents\\FileUpload.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask")));

		driver.findElement(By.id("processTask")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
		driver.findElement(By.id("pickfiles")).click();

		Thread.sleep(3000);
		File f = new File(path+"/mysyform_page-0001.jpg");
		if (f.exists()) {
			Assert.assertTrue(f.exists());
			{
			if(f.delete())
				System.out.println("file is deleted");
			}
		}
		else {
			System.out.println("file not found");
		}
			

	}

}
