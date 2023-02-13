package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		/*Relative Locators or Friendly Locators
		 * If any element don't have any id,class then it is useful
		 * Here we are getting the text from the Name label using above()
		 */
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		/*
		 * Here we are getting the text from the Password label using below()
		 */
		WebElement passwordEditBox = driver.findElement(By.cssSelector("[for='exampleInputPassword1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).below(passwordEditBox)).getText());
		
		/*Here we are clicking the submit button using below()
		 * In this ex it won't get the text of the date of birth bcz it is not a text box, it is flex
		 * so it directly goes to the submit button and clicking that button
		 */
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
		/*
		 * Here we are clicking the checkbox using toLeftOf()
		 */
		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		/*
		 * Here we get the text of the Student label using toRightOf
		 */
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		}

}
