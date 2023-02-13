package sslcheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinksForAll {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(int i=0;i<links.size();i++)
		{
			String url=links.get(i).getAttribute("href");
			 HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			 conn.setRequestMethod("HEAD");
			    conn.connect();
			    int respCode = conn.getResponseCode();
			   System.out.println(respCode);
			    
			    if(respCode>400)
			    {
			    	System.out.println("The link text is "+links.get(i).getText()+" and response code is "+respCode);
			    	//System.out.println("The link text is "+link.getText()+" and response code is "+respCode);
			    	Assert.assertTrue(false);
			    }
			   
		} 
		
		/*using for each loop to iterate all the links 
		 *  To run all the links uncomment the below code and run
		 *  And comment above code
		
		 for(WebElement link : links)
		 {
			String url=link.getAttribute("href");
			 HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			 conn.setRequestMethod("HEAD");
			    conn.connect();
			    int respCode = conn.getResponseCode();
			   System.out.println(respCode);
			   
			   if(respCode>400)
			    {
			    	System.out.println("The link text is "+link.getText()+" and response code is "+respCode);
			    	Assert.assertTrue(false);
			    }
		 }
		 */
	}

}
