package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageobjectFactory {

	WebDriver driver;
	public PageobjectFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Email']")
	WebElement e_mail;
	public WebElement email( ) {
		return e_mail;
	}

	
}
