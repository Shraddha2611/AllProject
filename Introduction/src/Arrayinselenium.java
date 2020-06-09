import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Arrayinselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  //declare implicit wait as a global

		WebDriverWait w = new WebDriverWait(driver,5);  //explicit Wait
		
		String[] neededVagetable = {"Tomato","Carrot","Brinjal"};  //creating array of vegetables what we need to add to cart array is created because it requires less memory
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		addIteams(driver,neededVagetable);

		driver.findElement(By.cssSelector("[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}
	public static void addIteams(WebDriver driver,String[] neededVagetable) throws InterruptedException 
	{
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product'] //h4[@class='product-name']")); //store all the vegetables into products
        List<WebElement> cartsList = driver.findElements(By.xpath("//div[@class='product-action']/button"));
		System.out.println("My products size"+products.size());
		
		for(int i=0;i<products.size();i++)
		{
			String[] name =products.get(i).getText().split("-");  //get text of all the vegetables Tomato - 1Kg we need only tomato that's why we split 
			String formatedName = name[0].trim(); //trim is used to remove white space
			System.out.println("my product name"+formatedName);
			
			List<String> neededVagetableList = Arrays.asList(neededVagetable);  //convert array to arraylist when needed

			int count=0;
			if(neededVagetableList.contains(formatedName))   //check if our required vegetables is present in list or not 
			{
				count++;
				
				cartsList.get(i).click();
			     if(count==neededVagetable.length) //check for number of time is 3 means all the vegeis are done then it is stop		
			     break;    		    	
			}
	 		
		}	
	}
}
