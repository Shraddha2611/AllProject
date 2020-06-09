import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());//return total frame present in total code
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //switch to frame

		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable")); 
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform(); //drag source block and drop into target block

		//driver.switchTo().defaultContent();//move to main content 
	}

}
