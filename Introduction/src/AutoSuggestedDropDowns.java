import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		/*driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).clear();
		driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys("MUM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys(Keys.ENTER);
		*/

	    
        driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).clear();
         driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys("MUM");
         driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys(Keys.ENTER);

	}

}
