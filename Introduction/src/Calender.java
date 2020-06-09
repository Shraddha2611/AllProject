import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click(); //click on input date
		while(!driver.findElement(By.xpath("//div//table//thead//tr[1]//th[2]")).getText().contains("November"))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div//table//thead//tr[1]//th[3]")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int size = driver.findElements(By.cssSelector(".day")).size();
		for(int i=0;i<size;i++)
		{
			 String allDates = driver.findElements(By.cssSelector(".day")).get(i).getText();
			 if(allDates.equalsIgnoreCase("26"))
			 {
				 driver.findElements(By.cssSelector(".day")).get(i).click();
				 break;
			 }
		}	
	}
}
