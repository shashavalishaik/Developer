package sslcheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCertificateSetting {

	public static void main(String[] args) {

		/*ChromeOptions is class we are using to manage the options of the browser i.e (to set behaviour of the browser)
		 * setAcceptInsecureCerts() method used to accept the ssl certification
		 */
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		
		/*Here we passed the options to WebDriver bcz we set the behavoiur before the WebDriver, it didn't know about the ChromeOptions
		 * for knowing about the ChromeOptions we passed the options to  ChromeDriver(options)
		 */
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		/*First print the Title before the setAcceptInsecureCerts setting true i.e(don't add ChromeOptions and setAcceptInsecureCerts, just print the Title normal procedure). Output-> privacy error
		 * After add ChromeOptions and  set setAcceptInsecureCerts to true then print the Title. Output-> expired.badssl.com this is the correct answer
		 */
		System.out.println(driver.getTitle());
	}

}
