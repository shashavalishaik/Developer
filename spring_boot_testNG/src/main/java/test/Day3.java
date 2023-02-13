package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute last at test level");
	}
	
	@Parameters({"URL","Key"})
	@Test
	public void WebLoginCarLoan(String urlName,String value)
	{
		//selenium
		System.out.println("WebLoginCar");
		System.out.println(urlName);
		System.out.println(value);
	}

	@Test
	public void MobileLoginCarLoan()
	{
		//App
		System.out.println("MobileLoginCar");
	}
	
	@Test
	public void MobileSignIn()
	{
		System.out.println("sign in from mobile");
	}
	
	@Test
	public void MobileSignOut()
	{
		System.out.println("sign out from mobile");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","xyzLogin"})
	public void LoginAPICarLoan()
	{
		//Rest API
		System.out.println("APILoginCar");
	}
	
	@Test(dataProvider="getData")
	public void xyzLogin(String username, String password)
	{
		System.out.println("xyz Login");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeTest
	public void firstExecution()
	{
		System.out.println("I will execute first at test level");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will execute first at framework/suite level");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I will execute last at framework/suite level");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will execute every time before the method executes and I am specific to class level");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("I will execute every time after the method executes and I am specific to class level");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I will execute first before any methods executes in this class and I am specific to class level");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I will execute  after all the methods executes in this class and I am specific to class level");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-> username, password-> good credit history=row
		//2nd combination-> username, password-> no credit history
		//3rd combination-> username, password-> credit history
		Object[][] data =new  Object[3][2];
		
		//1st set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
	
	@Test
	public void abc() {
		System.out.println("abc Test");
		Assert.assertTrue(false);
	}
}
