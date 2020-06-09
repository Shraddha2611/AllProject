
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:////chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // it maximize the window

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		// driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//second click for assending

		java.util.List<WebElement> firstList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>(); // create list for original value
		for (int i = 0; i < firstList.size(); i++) {
			originalList.add(firstList.get(i).getText()); // add the firstlist value into original list
		}

		System.out.println("************Original Data********");
		for(String original: originalList)
		{
			System.out.println(original);
		}

		ArrayList<String> updateList = new ArrayList<String>(); // create update list
		for (int i = 0; i < originalList.size(); i++) {
			updateList.add(originalList.get(i)); // add value into update list from original list for sorting
		}

		Collections.sort(updateList); // perform sorting

		Collections.reverse(updateList); // perform desending on value
		System.out.println("************Updated Data********");

		for(String s: updateList)
		{
			System.out.println(s);
		}
		

		Assert.assertTrue(originalList.equals(updateList)); // compare both list
	}
}