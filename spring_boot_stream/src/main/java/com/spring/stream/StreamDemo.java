package com.spring.stream;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class StreamDemo {

	//count the number of names starting with alphabet A in list
	
	@Test
	public void regular() {
		
		List<String>  names = new ArrayList<String>();
		names.add("vali");
		names.add("raghu");
		names.add("shaik");
		names.add("ram");
		names.add("Adam");
		
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	@Test
	public void streamFilter()
	{

		List<String>  names = new ArrayList<String>();
		names.add("vali");
		names.add("raghu");
		names.add("shaik");
		names.add("ram");
		names.add("Adam");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	
}
