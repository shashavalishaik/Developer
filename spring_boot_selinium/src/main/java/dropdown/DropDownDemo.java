package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	
	public static void main(String[] args)
	{
		

		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
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
		
	}
}
