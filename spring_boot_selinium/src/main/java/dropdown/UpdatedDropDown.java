package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	//	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//0.5 and 1 values
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("its not enabled");
			Assert.assertFalse(false);
		}
		}

}
