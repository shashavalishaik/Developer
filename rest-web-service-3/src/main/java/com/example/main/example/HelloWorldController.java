package com.example.main.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	

}
