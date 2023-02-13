package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

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
	}

}
