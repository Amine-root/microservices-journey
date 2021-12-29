package com.sid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SchoolRestController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> students(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getOneStudent(@PathVariable(name="id") Long id){
		return studentRepository.findById(id);
	}

	@PostMapping("/students")
	public Student save(@RequestBody Student student){
		return studentRepository.save(student);
	}
	
	@PutMapping("/students/{id}")
	public Student update(@PathVariable(name="id") Long id, @RequestBody Student student){
		student.setId(id);
		return studentRepository.save(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void delete(@PathVariable(name="id") Long id){
		studentRepository.deleteById(id);
	}

}
