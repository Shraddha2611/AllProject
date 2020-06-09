package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void studentName() {
		System.out.println("Kavya");
	
	}
	@Test(enabled=false)
	public void s_name() {
		System.out.println("Anjali");
	}
	@BeforeMethod
	public void St_name() {
		System.out.println("Zeelu");
	}
}
