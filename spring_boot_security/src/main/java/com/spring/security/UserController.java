package com.spring.security;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//all users
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return this.userService.getAllUsers();
	}

	
}

