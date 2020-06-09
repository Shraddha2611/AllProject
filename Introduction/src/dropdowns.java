import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByVisibleText("USD");
		s.selectByIndex(1);

		// driver.close();
	}

}
