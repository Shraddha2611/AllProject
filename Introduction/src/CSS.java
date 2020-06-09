import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("username");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("[id='Login']")).click();
	}

}
