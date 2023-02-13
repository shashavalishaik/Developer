package com.spring.security1;

public class Test {
	
	
	private String username;
	private String email;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Test [username=" + username + ", email=" + email + "]";
	}
	

	
}
