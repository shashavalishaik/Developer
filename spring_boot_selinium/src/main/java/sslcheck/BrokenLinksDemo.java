package sslcheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*Broken Link means URL is not working
		 * step-01 get all the urls tied up to the links using selenium
		 * java methods will call URL's and gets you the status code
		 * if status code >400 then that url is not working i.e link which tied to url is broken
		 * open website in console type-> $('a[href*="brokenlink"]') it shows the Broken link
		 */
		
		//getting the link and storing into url variable
     	String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");

		//printing the link
		System.out.println(url);
		
		/*To open the link 
		 * to open we are using openConnection() method that is present in URL class
		 * creating obj to URL class and passing our url in that
		 * type cast the parent class of URL is HttpURLConnection
		 * the return of openConnection() is HttpURLConnection
		 */
	    HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
	    
	    /*set the request method i.e POST,PUT,DELETE like that but in this ex we used (HEAD) reuest
	     * get the ResponseCode and store into respCode
	     * finally print the ResponseCode(respCode)
	     */
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int respCode = conn.getResponseCode();
	    System.out.println(respCode);
	    
	    /*To testing broken link 
	     * To check the ResponseCode for broken link uncomment the below code and run
	     * And comment above code
	     
	     String url1=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	     System.out.println(url1);
	      HttpURLConnection conn1=(HttpURLConnection)new URL(url1).openConnection();
	        conn1.setRequestMethod("HEAD");
	           conn1.connect();
	           int respCode1 = conn1.getResponseCode();
	           System.out.println(respCode1);
	     */
	}

}
