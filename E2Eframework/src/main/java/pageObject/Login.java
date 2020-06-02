package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	By email_id=By.id("user_email");
	By user_pass=By.id("user_password");
	By submit = By.cssSelector("input[type='submit']");
	By forgotPassword = By.cssSelector("a.link-below-button");
	
	public WebElement email() {
		return driver.findElement(email_id);
	}
	public WebElement password() {
		return driver.findElement(user_pass);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	public ForgotPassword forgotpass() {
		driver.findElement(forgotPassword).click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;
		
	}
}
