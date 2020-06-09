import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		Actions action = new Actions(driver); //creating variable of action class
	    WebElement w  =	driver.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"));
	    WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
	    action.moveToElement(w).build().perform(); //hover the content 
	    action.moveToElement(we).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform(); //hello is converted into caps and is selected 
	}

}
