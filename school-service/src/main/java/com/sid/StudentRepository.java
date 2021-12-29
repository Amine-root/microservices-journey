package com.sid;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long>{
	
//	http://localhost:9090/students/search/byName?key=Fede
	@RestResource(path="/byName")
	public List <Student> findByName(@Param(value="key") String key);
}
