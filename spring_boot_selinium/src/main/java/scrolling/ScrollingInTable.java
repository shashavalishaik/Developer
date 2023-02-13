package scrolling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingInTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	/*	before writing code goto website->inspect->console->
	 * to check the web page scroll-> window.scrollBy(0,500)
	 * to check the scrolling in table-> document.querySelector(".tableFixHead").scrollTop=5000 
	 */
		
		//JavascriptExecutor is a interface it helps to execute the JS script
		//you should add JavascriptExecutor type cast i.e (JavascriptExecutor)
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//to srcoll the web page
        js.executeScript("window.scrollBy(0,500)");
        
        //to wait for few sec, otherwise u won't able to see
        Thread.sleep(25L);
        
        //to srcoll the table, if u are using double quotes outside then use single quotes inside
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
        //To calculate the total amount
       List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
       int sum = 0;
       for(int i=0;i<values.size();i++)
       {  
    	  //To print the all the amounts  present in the amount column
    	  //converting string into int bcz getText() method returns string value so u need to convert into int 
    	  System.out.println(Integer.parseInt(values.get(i).getText()));
    	  
    	  //Retrieving individual elem and adding to sum 
    	  sum = sum + Integer.parseInt(values.get(i).getText());
       }
       
       //To display the total amount(sum)
       System.out.println(sum);
       
       
       /*Taking Total Amount Collected: 296 and comparing to our sum, if both the vaules are same then assertion true or else false
        * Total Amount Collected: 296 this is the String so we need to convert int
        * so first take the css path for Total Amount Collected: 296
        * then spliting into two parts, part1(Amount Collected) and part2( 296) for this we are using split() method and passing colon(:)
        * why we passed colon(:), before colon part1 and after colon part2
        * After spliting it assigns indexes for both, for part1 it assign index[0] and part2 index[1]
        * In part2( 296) white spaces are there, for removing white spaces we used trim() method
        * we passed index[1] after the split method bcz to know trim() method in which part it should remove bcz of that we passed index[1] 
        * finally for converting we used Integer.parseInt and stored value in total variable
        */
       
       //To print the Total Amount Collected: 296
       System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
       
       //To print the 296
       System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
       
       //converting String into int
       int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
       
       //finally comparing sum and total. If it is both values are same it returns true or else false
       Assert.assertEquals(sum, total);
	}

}
