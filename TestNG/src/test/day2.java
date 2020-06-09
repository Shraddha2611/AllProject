package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void subject()
	{
		System.out.println("java");
	}
	@Test(groups= {"high"})
	public void marks()
	{
		System.out.println("86");
	}
	@BeforeMethod 
	public void er_No()
	{
		System.out.println("94");
	}
	@Parameters({"URL"})
	@Test
	public void after(String urlname) {
		System.out.println("I am always after in suite");
		System.out.println(urlname);

	} 
	

}
