package com.spring.mvc.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDAO service;
	
	
	
	public UserResource(UserDAO service) {
		this.service = service;
	}


    @GetMapping("/users")
	public List<User> retrieveAllUsers()
	{
		return service.findAll();
	}

    @GetMapping("/users/{id}")
  	public User retrieveParticularUser(@PathVariable int id)
  	{
    	
  		return service.findOne(id);
  	}
    
    @DeleteMapping("/users/{id}")
  	public void deleteParticularUser(@PathVariable int id)
  	{
    	service.deleteById(id);
  	}
    
    @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user)
    {
    	service.save(user);
    }
    
    
}
