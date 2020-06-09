package test;

import org.testng.annotations.Test;

public class day1 {

	@Test(dependsOnMethods= {"second","name"})
	public void demo()
	{
		System.out.println("I am always present before");
	}
	@Test(groups= {"high"})
	public void name() {
		System.out.println("Hello Sp");
	}
	@Test
	public void second()
	{
		System.out.println("Bye Shraddha");
	}
}
