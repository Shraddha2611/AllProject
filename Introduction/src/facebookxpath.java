import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hello email");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Hello password");
		driver.findElement(By.cssSelector("input[data-testid='royal_login_button']")).click();
		//driver.close();
	}

}
