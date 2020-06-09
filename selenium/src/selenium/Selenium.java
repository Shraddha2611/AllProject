package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello SHRADDHA PRAJAPATI THIS IS YOUR FACEBOOK LOGIN");
		System.out.println("Enter Your Email ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String em=input.nextLine();
		System.out.println("Enter Your password ");
		String pas=input.nextLine();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://login.salesforce.com/");
		ob.findElement(By.cssSelector("#username")).sendKeys(em);
		ob.findElement(By.cssSelector("#password")).sendKeys(pas);
		ob.findElement(By.xpath("//*[@id=\'Login\']")).click();
	
		System.out.println(ob.findElement(By.id("error")).getText());
		//ob.quit();
	}
}
