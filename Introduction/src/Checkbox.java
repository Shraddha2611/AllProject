import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
