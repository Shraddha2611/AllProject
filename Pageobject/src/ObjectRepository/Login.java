package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {

	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	WebDriver driver;
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.xpath("//button[@type='submit']");
	
	
	public WebElement Email() {
		return driver.findElement(username);
	}
	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement Submit() {
		return driver.findElement(loginButton);
	}
}
	

