package com.spring.seleniumDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JDBCConnection {
	
	public static void main(String[] args) throws SQLException {
		

	
	String host = "localhost";
	String port = "3306";
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/selenium","root","#S$v@13071999");
	Statement stat = conn.createStatement();
	ResultSet rs= stat.executeQuery("select * from employeeinfo");
	ResultSet rs1= stat.executeQuery("select * from employeeinfo where id=4");
/*	while(rs.next())
	{
	System.out.println(rs.getString("name"));
	System.out.println(rs.getString("password"));
	}    */
	
	while(rs1.next())
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com");
	
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs1.getString("name"));
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs1.getString("password"));
  }
	}
}
