package cucumberOption;

import org.junit.Assert;
import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.Login;
import pageObject.PortalHomePage;
import resources.Base;

@RunWith(Cucumber.class)

public class stepDefinition extends Base {
	// LandingPage l = new LandingPage(driver);
	// Login lp;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = Initializedriver();
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@And("^Click on Login link in homepage to land on secure login page$")
	public void click_on_login_link_in_homepage_to_land_on_secure_login_page() throws Throwable {

		LandingPage l = new LandingPage(driver); // creating object of LandingPage to click on sign in button
		if (l.getPopupSize() > 0) {
			l.getPopup().click();
		}
		l.Login().click();

	}

	@When("^Users enter (.+) and (.+) and logs in$")
	public void users_enter_and_and_logs_in(String username, String password) throws Throwable {
		Login lp = new Login(driver);

		lp.email().sendKeys(username);
		lp.password().sendKeys(password);
		lp.submit().click();

	}

	@Then("^Verified that user is succesfully loged in$")
	public void verified_that_user_is_succesfully_loged_in() throws Throwable {
		PortalHomePage p = new PortalHomePage(driver);
		Assert.assertTrue(p.getSearch().isDisplayed());

	}
	@And("^browser is closed$")
    public void browser_is_closed() throws Throwable {
		driver.quit();
	}


}