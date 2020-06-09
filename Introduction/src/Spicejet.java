import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	    
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //for opening from dropdown
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();  //for selecting pune as a from place
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();  //for selecting gwaliur as a to place
		 
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();  //or selecting current date
	
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); //select friends and family checkbox 
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click(); //select one trip dropdown
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))  //disable return date
		{
			System.out.println("is disable");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("divpaxinfo")).click();  //select passanger 
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);  //selecting adult 
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();	
		}
		
		for(int m=1;m<3;m++)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Child")).sendKeys(Keys.ARROW_DOWN); //selecting child
			driver.findElement(By.id("ctl00_mainContent_ddl_Child")).click();	
		}
		
		Thread.sleep(2000);
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));  //open currancy dropdown
		s.selectByValue("AED"); //selecting AED 
		System.out.println("AED");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();  //click on search 
		
	}

}
