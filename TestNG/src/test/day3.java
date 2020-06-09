package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void collageName() {
		System.out.println("GEC Patan");
	}
	@Test(dataProvider= "getdata")
	public void c_Name(String username,String password) {
		System.out.println("VGEC");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getdata() {
		//we have 3 data set and multiple data 
		//we have to use multidimensional array
		 Object[][] obj = new Object[3][2]; //3 rows and 2 coumns for username and password
	
		 //for first 1st set
		obj[0][0]="username1";
		obj[0][1]="password1";
		
		//for second set 
		obj[1][0]="username2";
		obj[1][1]="password2";
		
		//for third set
		obj[2][0]="username3";
		obj[2][1]="password3";
		return obj;
		
	}
	
	@Test(groups= {"high"})
	public void co_name() {
		System.out.println("Nirma");
	}
	@Parameters({"URL","username"})
	@Test
	public void afterMethod(String urlname,String uname) {
		System.out.println("I am in always last in every method ");
		System.out.println(urlname);
		System.out.println(uname);

	}
	
}
