package com.spring.security1.studentController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.security1.student.User;

@Service
public class UserService {
	
	List<User> list=new ArrayList<>();

	public UserService() {

 
		list.add(new User("abc","abc", "abc@gmail.com"));
		list.add(new User("xyz","xyz", "xyz@gmail.com"));
	}
	
	
	//get all user 
	public List<User> getAllUsers(){
		
		return this.list;
	}
	
	//get single user
	public User getUser(String username)
	{
		return this.stream().filter((user)->user.getUsername().equals(name)).findAny().get();
	}

}
