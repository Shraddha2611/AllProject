import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int i=0;
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gsrtc.in/site/");
		driver.findElement(By.id("cboxClose")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //creating object of javascript
		String script = "return document.getElementById(\"matchStartPlaceA\").value;";//store value into script using javascript
		String data = (String) js.executeScript(script); //execute script
		
		driver.findElement(By.id("matchStartPlaceA")).sendKeys("meh");
		
		while(!driver.findElement(By.id("matchStartPlaceA")).getText().equalsIgnoreCase("Mehsana"))
		{
			i++;
			driver.findElement(By.id("matchStartPlaceA")).sendKeys(Keys.ARROW_DOWN);
			data = (String) js.executeScript(script); //execute script
			System.out.println(data);
			if(i>5)
			{
				break;
			}
		}		
		if(i>5)
		{
			System.out.println("Place name found");
		}
		else
		{
			System.out.println("Place name is not present");
		}
		
	}
}
