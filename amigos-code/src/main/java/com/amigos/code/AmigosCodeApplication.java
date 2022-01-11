package com.amigos.code;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.code.student.Student;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@RestController
@SpringBootApplication
public class AmigosCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosCodeApplication.class, args);
	}
	
	@GetMapping
	public List<Student> hello(){
		return Arrays.asList(new Student(1L, 
				"Mariam", 
				"mariam@gmail.com", 
				LocalDate.of(2000, Month.JULY, 28), 
				21));
	}
}
