import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Click Here')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();
		String parentid = it.next();

		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.cssSelector("[class='example']")).getText());

		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());

	}

}
