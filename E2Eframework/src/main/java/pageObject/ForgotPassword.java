package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	WebDriver driver;
	By user_email = By.id("user_email");
	By sendMeNotification = By.cssSelector("[type='submit']");

	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getemail() {
		return driver.findElement(user_email);
	}
	public WebElement sendNotification() {
		return driver.findElement(sendMeNotification);
	}
}
