import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size()); //return all the links present in page 
	
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //move to footer section
		System.out.println(footerDriver.findElements(By.tagName("a")).size()); //return link present in footer section
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //move to first column
		System.out.println(columnDriver.findElements(By.tagName("a")).size()); //return link present in 1st column
	
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //store shortcut key for open in new window into clickLinkTab
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab); //open every link in new tab
		}
		Thread.sleep(5000);
		Set<String> ids = driver.getWindowHandles();//store all windows
		java.util.Iterator<String> it =  ids.iterator(); //iterate windows 
		
		while(it.hasNext()) //check for next is present or not 
		{
			driver.switchTo().window(it.next()); //it switch to window 
			System.out.println(driver.getTitle()); //return title of all pages
		}
	}
}
