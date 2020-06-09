import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000); //for synchronization when it take time to load we can put it on sleep 
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='GOI']")).getText());
		
		//driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click(); //using index
		//System.out.println(driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).getText());

	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JDH']")).click();  //parent-child relationship
	    System.out.println(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JDH']")).getText());
	}

}
