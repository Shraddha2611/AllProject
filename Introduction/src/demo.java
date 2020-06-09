import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //selenium code : 
		//create driver object for chromedriver
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com"); //hit url on the browser
		System.out.println(driver.getTitle()); ///validate if your title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you are landed in current url
		//System.out.println(driver.getPageSource()); //print page source 
		
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.close();  //it closes current browser 
		driver.quit();  //it closes all browser open by selenium
	}

}
