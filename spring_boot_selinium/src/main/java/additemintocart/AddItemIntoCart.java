package additemintocart;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemIntoCart {

	public static void main(String[] args) {

		String[] itemNeeded= {"Brocolli","Cauliflower","Cucumber","Beetroot"};
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Adding All items in this list(in this ex 30 items is there)
		List<WebElement>  products=driver.findElements(By.cssSelector("h4.product-name"));
		
		//to get item text(item name) in the list using the index based
		for(int i=0;i<products.size();i++)
		{   
			//to store item names 
			//here we use get() bcz getting the index otherwise it won't work 
			String name=products.get(i).getText();
			
			//for getting the Cucumber item
			//here we not using equalIgnoreCase() method bcz it contains 1 and space(Cucumber - 1 Kg)
	/*		if(name.contains("Cucumber"))
			{   
				//Adding Cucumber to the cart
				//here we use get() bcz getting the index otherwise it won't work 
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				//for come out of the for loop bcz it scans 30 elems but we found Cucumber at index 3
				//so we stopping the loop here otherwise it loops remaining 27 elems(waste of time)
				break;
				
				
			}      */
			
			
			List itemNeededList=Arrays.asList(itemNeeded);
			
			if(itemNeededList.contains(name))
			{

				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
				
		}
		
	}

}
