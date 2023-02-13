package sslcheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksForAllWithSoftAssert {

	public static void main(String[] args) throws IOException {

		
		/*In previous ex we saw Hard Assertion 
		 * in that we used for loop and foreach loop
		 * But in previous example it stops the execution when it found the 1st broken link
		 * it doesn't continue the remaining links 
		 * In this example we are using Soft Assert 
		 * And aslo we are doing it won't stop at the 1st occurrence of broken link. 
		 * it executes all the links and finally displays the only broken links
		 */
		
		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new  SoftAssert();
		
		 for(WebElement link : links)
		 {
			String url=link.getAttribute("href");
			 HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			 conn.setRequestMethod("HEAD");
			    conn.connect();
			    int respCode = conn.getResponseCode();
			   System.out.println(respCode);
			   a.assertTrue(respCode<400, "The link text is "+link.getText()+" and response code is "+respCode);
		 }
		 a.assertAll();
	}
	

}
