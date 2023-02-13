package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//selecting place from  From(src)
		
		/*
		   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		   driver.findElement(By.xpath("//a[@value='BLR']")).click();
		*/
	    
		
     	  // 1.selecting place from To(dest)
          // 2.selecting Thirupati from To(dest), here we use index[2] bcz Thirupati present
       	  //	          in both From(src) and To(dest). otherwise it will throws exception 
		 
		
		/*
		    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		    driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
		*/
		
		
		//selecting place from From(src) without using index
		//parent path(full xpath)-> /html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]
		//child path-> //a[@value='BLR']
		
		/*
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2] //a[@value='BLR']")).click();
		  */
		
		
		//selecting place from To(dest) without using index
		//parent path(full xpath)-> /html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]
		//child path-> //a[@value='TIR']
		
		/*
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2] //a[@value='TIR']")).click();
		*/
		
		
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
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[5]")).click();
		
		
	}

}
