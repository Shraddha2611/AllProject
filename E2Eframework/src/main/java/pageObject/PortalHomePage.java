package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	WebDriver driver;

	public PortalHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By Search = By.name("query");

	public WebElement getSearch() {
		return driver.findElement(Search);
	}

}
