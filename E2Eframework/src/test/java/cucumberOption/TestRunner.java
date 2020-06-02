package cucumberOption;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src\\test\\java\\cucumberOption",
	    glue="cucumberOption\\stepDefinition")

public class TestRunner extends AbstractTestNGCucumberTests {	
}
