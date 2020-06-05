import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=0;
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys("can");
		
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = " return document.getElementById(\"autocomplete\").value;";
		String data= (String) js.executeScript(script);
		while(!script.equalsIgnoreCase("Canada"))
		{ 
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			data= (String) js.executeScript(script);			
			System.out.println(data);
			//System.out.println("Element found ");
			if(i>3)
			{
				break;
			}
			
		}
		if(i>3)
		{
			System.out.println("Element found ");
		}
		//System.out.println(	driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
