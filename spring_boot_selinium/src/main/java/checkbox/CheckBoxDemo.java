package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//for selecting senior citizen check box
		//first  time it returns false bcz here still our check box is not selected
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
        //to check it returning false or not using Assert method
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
        
		
		//here we selecting our senior citizen check box
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//here it returns true bcz we selected  our senior citizen check box 
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//to check its returning true or not using Assert method
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//for counting how many check boxes are there 
		//for this find the common value or class name for all the check boxes
		//for this example input[type='checkbox'] is common for all the checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
        //to get the width and height of the particular check box[here we taken senior citizen check box]
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).getSize());
		
		}

}
