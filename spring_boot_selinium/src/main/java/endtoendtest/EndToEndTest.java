package endtoendtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTest {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000L);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		for(WebElement option:options)
		{
			//for printing last elem
			//System.out.println(option.getText());
			
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			
			  //selecting place from From(src) without using index
			//parent path(id)-> //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']
			//child path-> //a[@value='BLR'] 
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
	         
			
			
	        //selecting place from To(dest) without using index
			//parent path(id)-> //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
			//child path->  //a[@value='TIR']
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='TIR']")).click();
			//Thread.sleep(2000l);
			
			//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[6]")).click();
			
			
			
			//selecting the dropdown id
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
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
			
			
			//dropdown with select tag -static
			WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			
			Select dropdown=new Select(staticDropDown);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			dropdown.selectByIndex(2);
		    System.out.println(dropdown.getFirstSelectedOption().getText());
			
			dropdown.selectByVisibleText("USD");
			System.out.println(dropdown.getFirstSelectedOption().getText());
		
		    dropdown.selectByValue("INR");
		    System.out.println(dropdown.getFirstSelectedOption().getText());
		    
		    //for searching 
		    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();	
		    }

}
