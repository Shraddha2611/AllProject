import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		
		System.out.println("Parent title "+driver.getTitle());
		driver.findElement(By.xpath("//a[@class='action-button']")).click();
		
		
		Set<String> ids =  driver.getWindowHandles(); //store all id's 
		Iterator <String> it = ids.iterator();  //iterat id and store into it
		
		String parentid = it.next(); //select parent window
		String childid = it.next();  //select child window 
		
		
		driver.switchTo().window(childid);  //move to child window
		System.out.println("child title "+driver.getTitle());
		
		driver.switchTo().window(parentid); //move to parent window
		System.out.println("Parent title "+driver.getTitle());

	}

}
