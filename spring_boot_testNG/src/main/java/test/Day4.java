package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(timeOut=4000)
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHome");
	}
    
	@Parameters({"URL"})
	@Test
	public void MobileLoginHomeLoan(String urlName)
	{
		//App
		System.out.println("MobileLoginHome");
		System.out.println(urlName);
	}
	
	@Test(enabled=false)
	public void LoginAPIHomeLoan()
	{
		//Rest API
		System.out.println("APILoginHome");
	}
	
	

}
