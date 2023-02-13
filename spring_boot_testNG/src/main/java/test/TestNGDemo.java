package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	/*install the eclipse TestNG
	 * for first time @Test annotation  move on cursor on it shows add TestNG library and add junit4 and 5 library
	 * you should add the TestNG library
	 * we can run the class without the main method 
	 * Run as TestNG
	 * If you are define the 2 test cases then TestNG consider as first @Test is the first test case 
	 * And second @Test is the 2nd test case this means we achieved  multiple test cases in single class
	 */
	@Test(groups= {"Smoke Test"})
	public void FirstTest()
	{
		System.out.println("Hello World");
	}
	
	@Parameters({"URL"})
	@Test
	public void thirdTest(String urlName)
	{
		System.out.println("how are you");
		System.out.println(urlName);
	}
	@Test(groups= {"Smoke Test"})
	public void SecondTest()
	{
		System.out.println("Bye");
	}

	/*how to create test xml file-> right click on project-> TestNG-> convert to TestNG-> next-> finish
	 * the use of test xml file is to run all the test cases at a time either they are present in same class or diff class but package must be same
	 * how to run test xml-> right click on test xml-> run as-> TestNG
	 */
	
	/*structure of test xml is
	 * Test suite(starting)->Test folder(package)->test cases(classes)
	 */
}
