package com.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.sms.entity.Student;
import com.javaguides.sms.repository.StudentRepository;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		
//		Student student1=new Student("Ramesh","Suresh","rs@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("vali","shaik","vali@gmail.com");
//		studentRepository.save(student2);
//	}

}
