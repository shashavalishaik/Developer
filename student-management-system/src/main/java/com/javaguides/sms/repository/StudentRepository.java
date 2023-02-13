package com.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.javaguides.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{
	
	
	
	

}
