package com.vali.junit5.hellojunit5;

public class GreetingImpl1 implements Greeting1 {

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		if(name==null|| name.length()==0)
		{
			throw new IllegalArgumentException();
		}
		return "HEllo"+name;
	}

}
