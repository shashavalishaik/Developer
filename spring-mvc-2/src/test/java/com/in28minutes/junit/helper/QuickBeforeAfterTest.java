package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

class QuickBeforeAfterTest {

	
	@BeforeAll
	public static void beforeClass()
	{
		System.out.println("Before class ");
	}

	@BeforeEach
	void test() {
		System.out.println("Before exceuted ");
	}
	
	
	@Test
	void test1() {
		System.out.println("Test1 exceuted ");
	}

	
	@Test
	void test2() {
		System.out.println("Test2 exceuted ");
	}
	
	@AfterEach
	public void teardown()
	{
		System.out.println("After test");
	}
	
	@AfterAll
	public static  void test3()
	{
		System.out.println("After all test");
	}
}
