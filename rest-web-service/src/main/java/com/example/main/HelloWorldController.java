package com.example.main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;  
//Controller  
@RestController  
public class HelloWorldController   
{  
//using get method and hello-world as URI  
@GetMapping("/shash/api")  
public String helloWorld()  
{  
return "Hello World";  
}  
}  