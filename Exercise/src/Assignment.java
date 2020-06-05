import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		System.out.println("Number of rows "+table.findElements(By.tagName("tr")).size()); //return number of rows
		System.out.println("Number of column "+table.findElements(By.tagName("th")).size()); //return number of column

		System.out.println(table.findElement(By.xpath("//table//tbody//tr[3]//td[1]")).getText()); //return data of second row
		System.out.println(table.findElement(By.xpath("//table//tbody//tr[3]//td[2]")).getText());
		System.out.println(table.findElement(By.xpath("//table//tbody//tr[3]//td[3]")).getText());
	}
}
