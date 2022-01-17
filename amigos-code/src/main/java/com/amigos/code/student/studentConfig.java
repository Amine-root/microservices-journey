package com.amigos.code.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student mariam = new Student(
					1L, 
					"Mariam", 
					"mariam@gmail.com", 
					LocalDate.of(2000, Month.JULY, 28), 
					21);

			Student alex = new Student(
					"Alex", 
					"alex@gmail.com", 
					LocalDate.of(2004, Month.JULY, 28), 
					21 );

			repository.saveAll(Arrays.asList(alex, mariam));

		};
	}
}
