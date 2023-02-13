package com.spring.mvc.user;

import javax.validation.constraints.Size;

public class User {
	private Integer id;
	
	@Size(min=2)
	private String name;
	
	
	private String birthDay;
	
	public User(Integer id, String name, String birthDay) {
		super();
		
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDay=" + birthDay + "]";
	}
	
	
	
	

}
