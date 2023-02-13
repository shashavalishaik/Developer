package com.spring.boot.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AopController {

	@Autowired
	private Student student;
	
	public Student result(Student student)
	{
		student.setId(10);
		return student;
	}
}
