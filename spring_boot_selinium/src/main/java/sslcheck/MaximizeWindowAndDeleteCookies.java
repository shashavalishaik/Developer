package sslcheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndDeleteCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		/*manage() is used to manage the windows maximize, to add cookie, delete single cookie and delete all cookies
		 * 
		 */
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to delete all the cookies
		driver.manage().deleteAllCookies();
		
		//to delete the single cookie. you should pass the cookie name as parameter
		driver.manage().deleteCookieNamed("cdsCweC");
		
		driver.get("http://google.com");
		
		/*Interview question
		 * delete the session cookie and click on any page and login page -verify login url
		 * solution: use the driver.manage().deleteCookieNamed("SessionKey");
		 * Note: you should pass the SessionKey
		 */
	}

}
