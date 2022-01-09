package com.sid;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class AppService {

	public static void main(String[] args) {
		SpringApplication.run(AppService.class, args);
	}
	
	@Bean
	CommandLineRunner start(StudentRepository studentRepository, RepositoryRestConfiguration restConfiguration, LaboratoryRespository labRepo) {
		return args -> {
			
			restConfiguration.exposeIdsFor(Student.class);
			Laboratory l1 = labRepo.save(new Laboratory("Computer science", null, "contact@gmail.com", null));
			Laboratory l2 = labRepo.save(new Laboratory("Computer science", null, "contact@gmail.com", null));
			studentRepository.save(new Student(null, "Fede", "Fede@gmail.com", new Date(), l1));
			studentRepository.save(new Student(null, "Samir", "samir@gmail.com", new Date(), l2));
			studentRepository.save(new Student(null, "Ihssan", "ihssan@gmail.com", new Date(), l1));
			studentRepository.save(new Student(null, "Satra", "satra@gmail.com", new Date(), l1));
			
			studentRepository.findAll().forEach(st -> {
				System.out.println(st.getName());
			});
			
		};
	}

}
