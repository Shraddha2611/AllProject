import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click(); //click on 3rd textbox
		String store = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText(); //store text option 3 into store
		System.out.println("Slected option is "+store);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		Select select = new Select(dropdown); //select dropdown
		select.selectByVisibleText(store); //select option with match to  store
		driver.findElement(By.name("enter-name")).sendKeys(store); //enter name in alert textbox present in store
		driver.findElement(By.id("alertbtn")).click(); //click button

		String text = driver.switchTo().alert().getText(); //switch to alert box
		if (text.contains(store)) //check for valid selected option present in alert message 
		{

			System.out.println("Alert message successfully done ");

		} else

			System.out.println("Something went wrong");
	}

}
