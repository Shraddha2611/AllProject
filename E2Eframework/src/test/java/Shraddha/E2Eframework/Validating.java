package Shraddha.E2Eframework;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.LandingPage;
import resources.Base;

public class Validating extends Base {
	public WebDriver driver;// to run test as a indepedantly
	public static Logger log = LogManager.getLogger(Base.class.getName());
	LandingPage lm;

	@BeforeTest
	public void initialization() throws IOException {
		driver = Initializedriver();// all the Initializedriver methods are invoked by driver
		log.info("driver is initialize");

		driver.get(prop.getProperty("url"));
		log.info("home page open");
	}

	@Test()
	public void validateBar() throws IOException {
		lm = new LandingPage(driver); // creating object of LandingPage to click on sign in button
		lm.Navigation().isDisplayed();
		Assert.assertTrue(lm.Navigation().isDisplayed());
		log.info("successfully displayed");
	}

	@Test()
	public void validateTitle() throws IOException {

		Assert.assertEquals(lm.Title().getText(), "FEATURED COURSES");
		log.info("Successfully completed");
		System.out.println("Tests is comepleted");
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
