package com.spring.selinium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumDemo1 {

	public static void main(String[] args) throws InterruptedException {

		
		try {
		    // Add a wait timeout before this statement to make 
		    // sure you are not checking for the alert too soon.
		   
		    
		
		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/sk005/Desktop/HtmlandCss/page1.html");
	 Alert alt = driver.switchTo().alert();
		    alt.accept();
		    TimeUnit.SECONDS.sleep(3);
	
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("id3"));
		//System.out.println(driver.getCurrentUrl());
		
		driver.close();
				//driver.quit();
		} catch(NoAlertPresentException e) {
		    // No alert found on page, proceed with test.

            e.printStackTrace();
		}
	}

}
