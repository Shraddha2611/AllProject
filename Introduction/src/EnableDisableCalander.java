import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnableDisableCalander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		driver.findElement(By.xpath("//a[@value='AMD']")).click(); //selecting from ahmedabad
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click(); //selecting to kolkatta
	
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click(); //for getting current date
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();  //select roundtrip radiobutton
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));  
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) //for enabling return date
		{
			System.out.println("is enable");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertFalse(false);
		}
	}

}
