package sslcheck;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		/*First thing is search in commons.io.fileutils and download jar and import into project
		 * First type cast the driver obj to TakesScreenshot i.e ((TakesScreenshot)driver)
		 * Then you should specifies the in which format you want the output using getScreenshotAs() method i.e getScreenshotAs(OutputType.FILE)
		 * In this ex returning output as file format
		 * store the output into src obj
		 * To copy output into your local machine and displays it. For this we are using  FileUtils i.e FileUtils.copyFile(src, new File("/Users/sk005/Desktop/screenshot.png"));
		 * pass the srouce agrument(src) and pass path(/Users/sk005/Desktop/screenshot.png) to destination argument. Here screenshot.png is name we arev giving to a output
		 * Don't give path as c directory you will got access deined error bcz our c directory won't give access. so create a folder then pass the path
		 * Note: don't forgot giving your screenshot  name
		 */
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/sk005/Desktop/screenshot.png"));
	}

}
