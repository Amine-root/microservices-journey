package com.amigos.code.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentService {

	@GetMapping
	public List<Student> getStudents(){
		return Arrays.asList(new Student(1L, 
				"Mariam", 
				"mariam@gmail.com", 
				LocalDate.of(2000, Month.JULY, 28), 
				21));
	}
	
	
}
