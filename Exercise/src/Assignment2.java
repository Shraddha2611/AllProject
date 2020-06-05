import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("Adults")).click(); //click on adults dropdowns
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("5");  //selecting 5 adults
		
		driver.findElement(By.id("Childrens")).click(); //click on children drop downs
		Select j = new Select(driver.findElement(By.id("Childrens")));
		j.selectByValue("2"); //select 2 children
		
		driver.findElement(By.id("DepartDate")).click();  //click on date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();  //selecting current date 
		
		driver.findElement(By.id("MoreOptionsLink")).click();  //click on more option 
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo"); //enter airlines name 
		
		driver.findElement(By.id("SearchBtn")).click(); //click on search button 
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
