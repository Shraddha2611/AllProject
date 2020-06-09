import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("[title*='Sign']")).click();
	}

}
