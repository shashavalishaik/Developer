package RelativeLocator;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows {

	public static void main(String[] args) {

		

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
		
		//passing the course name into name text box 
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		
		//exit the execution
		driver.quit();
	}

}
