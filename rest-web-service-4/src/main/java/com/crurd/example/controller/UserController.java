package com.crurd.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crurd.example.entity.User;
import com.crurd.example.repository.*;
import antlr.collections.List;

@RestController
@RequestMapping("/api/usres")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getAllUsers()
	{
		return this.userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable (value="id") long userId) {
		return this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found with id :"+userId));
		
		
		public User createUser(@RequestBody User user)
		{
			return this.userRepository.save(user);
		}
		
		@PutMapping("/{id}")
		public User updateUser(@RequestBody User user, @PathVariable("id") long userId)
		{
			User existing=this.userRepository.findById(userId).orElseThrow() ->new ResourceNotFoundException("User not found with id :"+userId));
			existing.setFirstName(user.getFirstName());
			existing.setFirstName(user.getLastName());
			existing.setFirstName(user.getEmail());
			return this.userRepository.save(existing);
		}
		
		@DeleteMapping("{id}")
		public ResponseEntity<User> deleteUser(@PathVariable ("id") long userId)
		{
			
			User existingUser=this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found with id :"+userId));
            thid.userRepository.delete(existingUser);
            return ResponseEntity.ok().build();
		}
		
	}
	
}
