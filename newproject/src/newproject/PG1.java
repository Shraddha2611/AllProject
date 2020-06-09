package newproject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello AAYUSH PRASAD THIS IS YOUR FACEBOOK LOGIN");
		System.out.println("Enter Your Email ");
		Scanner input =new Scanner(System.in);
		String em=input.nextLine();
		System.out.println("Enter Your password ");
		String pas=input.nextLine();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.facebook.com/");
		ob.findElement(By.id("email")).sendKeys(em);
		ob.findElement(By.id("pass")).sendKeys(pas);
		ob.findElement(By.id("u_0_b")).click();
	}
}
