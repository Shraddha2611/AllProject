package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	public Home(WebDriver driver) {
		this.driver=driver;
	}
	WebDriver driver;

	By emp_name = By.name("sname");

	public WebElement Emp_name( ) {
		return driver.findElement(emp_name);
	}
}
