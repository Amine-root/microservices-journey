package com.sid;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppService {

	public static void main(String[] args) {
		SpringApplication.run(AppService.class, args);
	}
	
	@Bean
	CommandLineRunner start(StudentRepository studentRepository) {
		return args -> {
			studentRepository.save(new Student(null, "Hassan", "hassan@gmail.com", new Date()));
			studentRepository.save(new Student(null, "Samir", "samir@gmail.com", new Date()));
			studentRepository.save(new Student(null, "Ihssan", "ihssan@gmail.com", new Date()));
			studentRepository.save(new Student(null, "Satra", "satra@gmail.com", new Date()));
		};
	}

}
