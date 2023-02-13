package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownLooping {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
		//selecting the dropdown id
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
       //selecting single flighjt ticket
//		driver.findElement(By.id("hrefIncAdt")).click();
		
		//selecting muliple flight ticket using manual process
/*		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();   */
		
		//selecting multiple filght tickets using for loop
/*		for(int i=1;i<4;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}    */
		
		//selecting multiple flight tickets using while loop
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		//After selecting the flight tickets for clicking Done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//To know what text will return u
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//to check it returning 5 adult or not using Assert method
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		
	
	}
}
