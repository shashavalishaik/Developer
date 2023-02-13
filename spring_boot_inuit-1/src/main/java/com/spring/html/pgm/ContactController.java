package com.spring.html.pgm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	
	@RequestMapping("/contacts")
	public String showForm(Model model)
	{
		model.addAttribute("name", "vali");
		return "contact";
	}
	
	

}
