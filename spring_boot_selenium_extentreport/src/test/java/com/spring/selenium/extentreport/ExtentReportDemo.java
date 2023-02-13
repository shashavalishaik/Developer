package com.spring.selenium.extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	public ExtentReports extent; 
	
	/*ExtentSparkReporter class this is the helper class and its help to the main class(ExtentReports).And it  expects the path where to create the reports and its responsible for creating the reports
	 * System.getProperty("user.dir") it brings the system path and \\reports\\index.html it create the reports and index.hmtl in that reports will show/save
	 * To set the Report name as "Web Automation Results" using setReportName() method
	 * To set the Report title as "Test Results" using setDocumentTitle() method
	 * ExtentReports class this is the main class is used to drive all our report execution
	 * Attach the report from ExtentSparkReporter class to ExtentReports class obj and pass the ExtentSparkReporter obj using attachReporter() method
	 * set the tester name 
	 * Note: ExtentReports extent = new ExtentReports(); if you create the ExtentReports class obj within the method its become the local scope we can't access the through out the test
	 *       so create it in global level i.e public ExtentReports extent; 
	 */
	@BeforeTest
	public void config()
	{
		//ExtentReports, ExtentSparkReporter
	    String path =	System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
	//	ExtentReports extent = new ExtentReports();
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shashavali");
	}

	/*Create a test report using createTest() method and give the name of the test and store it in test variable using the ExtentTest class
	 * To end the test report using extent.flush(); Note:mandatory to end the test report
	 * Note: if you are not  to it in variable  then use extent.createTest("initial Demo");
	 */
	@Test
	public void intialDemo()
	{
		
		//extent.createTest("initial Demo");
		ExtentTest test = extent.createTest("initial Demo");
		System.setProperty("webdriver.chrome.driver","/Users/sk005/Downloads/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		extent.flush();
	}
}
