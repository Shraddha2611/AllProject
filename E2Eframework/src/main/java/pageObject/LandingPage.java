package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By signin = By.cssSelector("i.fa.fa-lock.fa-lg");
	private By nav_bar = By.cssSelector("div.container");
	private By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By popUp = By.xpath("//button[contains(text(),'NO THANKS')]");

	public WebElement Login() {
		return driver.findElement(signin);
		//Login lp = new Login(driver);
		//return lp;
	}
	public int getPopupSize() {
		return driver.findElements(popUp).size();
	}

	public WebElement getPopup() {
		return driver.findElement(popUp);
	}
	public WebElement Navigation() {
		return driver.findElement(nav_bar);
	}

	public WebElement Title() {
		return driver.findElement(title);
	}
}
