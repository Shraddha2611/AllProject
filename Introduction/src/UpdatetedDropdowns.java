import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatetedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		
		int i = 1;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}

}
