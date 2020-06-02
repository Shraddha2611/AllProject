package Shraddha.E2Eframework;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.Login;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;//to run test as a indepedantly
	 public static Logger log =LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialization() throws IOException {
		driver=Initializedriver();//all the Initializedriver methods are invoked by driver
		log.info("driver is initialize");
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));

		LandingPage l = new LandingPage(driver); //creating object of LandingPage to click on sign in button 
		
		l.Login().click();
		Login lp=new Login(driver);

		lp.email().sendKeys(username);
		lp.password().sendKeys(password);
		lp.submit().click();	
		
		ForgotPassword fp = lp.forgotpass();
		Thread.sleep(2000);
		fp.getemail().sendKeys("abc");
		fp.sendNotification().click();
	}
		@DataProvider
		public Object[][] getData() throws InterruptedException {
			
			Object [][] data = new Object[2][2];
			data[0][0]="shraddha@mail.com";
			data[0][1]="123";
			
			Thread.sleep(2000);
			data[1][0]="sp@mail.com";
			data[1][1]="456";
			return data;
	}
 }

		/*@AfterTest
		public void CloseBrowser() {
			driver.close();
		}*/

/*
 * LandingPage l=new LandingPage(driver);
		l.getLogin().click(); //driver.findElement(By.css()
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);

		log.info(text);
		
		lp.getLogin().click();
		
 */
