package com.spring.boot.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
    @RequestMapping("/getdata")
	public String home()
	{
    	return "home.jsp";
	}
}
