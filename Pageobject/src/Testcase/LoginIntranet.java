package Testcase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Home;
import ObjectRepository.Login;
import ObjectRepository.PageobjectFactory;

public class LoginIntranet {

	
	@Test
	public void LoginClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://intranet.einfochips.com/intranets/auth/login");
		
		Login l = new Login(driver);
		l.Email().sendKeys("shraddha.prajapati");
		l.Password().sendKeys("shraddha2611intranet");
		l.Submit().click();
		
		Thread.sleep(2000);
		PageobjectFactory pf = new PageobjectFactory(driver);
		pf.email().click();
		
		Home h = new Home(driver);
		 h.Emp_name().sendKeys("kavya soni",Keys.ENTER);
	}
}

