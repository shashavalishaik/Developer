package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(nameEditBox.getRect().getDimension().getHeight());
		System.out.println(nameEditBox.getRect().getDimension().getWidth());
	}

}
