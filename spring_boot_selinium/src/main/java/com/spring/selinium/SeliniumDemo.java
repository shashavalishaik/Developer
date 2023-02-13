package com.spring.selinium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeliniumDemo {

	public static void main(String[] args) {
		
		
		    
		
		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("vali");

		driver.findElement(By.name("password")).sendKeys("shaik");

		driver.findElement(By.className("btn-primary")).click();
		System.out.println(driver.findElement(By.cssSelector("div.inline-error")).getText());
		
		driver.findElement(By.linkText("Forgot Password")).click();
		
		//System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("/html/body/button[2]")).click();
		//driver.close();
				//driver.quit();
	
		
		

	}
	
	
	


}
