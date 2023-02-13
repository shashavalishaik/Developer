package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		String text="vali";
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//passing name
		driver.findElement(By.id("name")).sendKeys(text);
		
		//clicking Alert button
		driver.findElement(By.id("alertbtn")).click();
		
		//getting text which was displayed on pop up alert  window
		System.out.println(driver.switchTo().alert().getText());
		
		//accepting ok button on the pop up alert  window
		driver.switchTo().alert().accept();
		
		//clicking on Confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		//getting text which was displayed on the pop up  window
		System.out.println(driver.switchTo().alert().getText());
		
		//accepting the ok button on pop up window
		//driver.switchTo().alert().accept();
		
		//dismiss the cancel button on pop up window
		driver.switchTo().alert().dismiss();
	}

}
