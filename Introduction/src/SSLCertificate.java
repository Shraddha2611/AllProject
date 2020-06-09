import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = DesiredCapabilities.chrome();//all desired capabilities of chrome
			

		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//dc.acceptInsecureCerts(); //another way of accept certificate
		
		ChromeOptions option = new ChromeOptions(); //creating object of local chrome
		//option.merge(dc); //merge general capabilities to our local chrome option
		
		System.setProperty("webdriver.chrome.driver", "E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver(option); //all capabilities access are in our chrome driver
		
	}

}
