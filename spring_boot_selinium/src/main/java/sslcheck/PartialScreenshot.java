package sslcheck;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		


		/*After opening above browser
		 * Now open new tab with blank
		 * Note: After opening new tab Still our cursor in first browser only i.e (the controller still in first browser/tab only)
		 * we need to perform anything in new tab, we should give cursor/controller to the new tab
		 * getWindowHandles() method holds the all of tabs id
		 * After that we need to perform Iterator
		 * for first time next() method gives the parentWindowId i.e(first browser/tab)
		 * for second time next() method gives the childWindowId i.e(new browser/tab)
		 * taking a course name from new tab and passing into name text box in first browser
		 * finally taking screenshot of that particular text box which we passed the course name
		 */
		
		/*This line opens a new tab
		 * newWindow() method takes the WindowType as argument
		 */
		driver.switchTo().newWindow(WindowType.TAB);
		
		/*this line gives Id's of the both browser i.e(first browser and new tab)
		 * getWindowHandles() method holds the all of tabs id
		 * and return type is Set<String> 
		 */
		Set<String> handles = driver.getWindowHandles();
		
		/*Now handles holds the both id's
		 * so for getting one/specific id you need do iterator
		 * iterator() method return type is Iterator<String> 
		 */
		Iterator<String> it = handles.iterator();
		
		//this line give us first browser id
		String parentWindowId = it.next();
		
		//this line give us new browser/tab id
		String childWindowId = it.next();
		
		//giving controller to new tab by passing child window id(childWindowId)
		driver.switchTo().window(childWindowId);
		
		//now hitting the url
		driver.get("https://www.rahulshettyacademy.com/");
		
		//getting the course name by using index based
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(3).getText();
		
		//printing the course name
		System.out.println(courseName);
		
		//giving controller/cursor back to first browser/tab
		driver.switchTo().window(parentWindowId);
		
		//passing the course into the name text box
		WebElement name  =	driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		
		 /* you should specifies the in which format you want the output using getScreenshotAs() method i.e getScreenshotAs(OutputType.FILE
		  * In this ex returning output as file format
		  * store the output into file obj
		  * To copy output into your local machine and displays it. For this we are using  FileUtils i.e FileUtils.copyFile(src, dest)
		  * for src pass file and dest give your screenshot name i.e (logo.png)
		  * To see screenshot run your application and refresh your project
		  * it will show in your project
		  * right click on screenshot-> properties-> click on location/path then see
		  */
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
	}

}
