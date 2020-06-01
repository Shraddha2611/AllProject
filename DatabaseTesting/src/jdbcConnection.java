import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank?serverTimezone=UTC", "root","");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM `customerinfo` WHERE Name='man'"); // we want data of man
		while (rs.next()) // it moves base index to first index
		{
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			
			driver.findElement(By.id("username")).sendKeys((rs.getString("Username"))); // return username
			driver.findElement(By.id("password")).sendKeys((rs.getString("Password"))); // return password
		}

	}
}
