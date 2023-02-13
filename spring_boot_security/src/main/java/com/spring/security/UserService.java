package com.spring.security;
import com.spring.security.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	List<User> list=new ArrayList<>();

	public UserService() {
		
		list.add(new User( "vali",  "abc", "bly"));
	}
	

	public List<User> getAllUsers()
	{
		return this.list;
	}
	
	
}
