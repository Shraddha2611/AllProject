import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Krishitamart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] neededIteam = {"ACRYLIC PLASTIC PVC SHEET PERSPEX CUTTER CUTTING TOOL","46PCSMETAL 14 SOCKET SET (BLACK, 46PCS)"};
		driver.get("https://krishitamart.com/");
		//driver.findElement(By.xpath("//li[@class='site-header-account-link']//a")).click();
		//driver.findElement(By.id("customer_email")).sendKeys("shraddhaprajapati375@gmail.com");
		//driver.findElement(By.id("customer_password")).sendKeys("Shraddha2611");
		//driver.findElement(By.cssSelector(".button-primary.form-action--submit")).click();
		driver.findElement(By.cssSelector(".navmenu-item.navmenu-item-parent.navmenu-id-home-appliances")).click();
		driver.findElement(By.cssSelector(".productgrid--no-results-button")).click();
	
		List<WebElement> products = driver.findElements(By.cssSelector("h2.productitem--title"));
		
		for(int i=0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			
			List<String> neededIteamList = Arrays.asList(neededIteam);
			int count=0;
			if(neededIteamList.contains(name))   //check if our required vegetables is present in list or not 
			{
				count++;
				driver.findElement(By.xpath("//button[@class='/productitem--action-trigger productitem--action-atc button-primary']")).click();
				
				if(count==neededIteam.length) //check for number of time is 3 means all the vegeis are done then it is stop
				break;
			}
			
		}
			
	}
}
