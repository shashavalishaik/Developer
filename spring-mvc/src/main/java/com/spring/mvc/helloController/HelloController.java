package com.spring.mvc.helloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloController {
     
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/hello world")
	//@GetMapping(path="/hey-world")
	public String helloworld()
	{
		return "HELLO WORLD";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloworldbean()
	{
		return new HelloWorldBean ("HELLO WORLD");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloworldPathVaraiable(@PathVariable String name)
	{
		return new HelloWorldBean (String.format("Hello World,%s",name));
	}
}
