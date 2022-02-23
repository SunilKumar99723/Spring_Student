package com.studentapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.models.Student;
import com.studentapp.repository.StudentRepo;

//@Controller
@CrossOrigin(origins="http://localhost:3000")
@RestController   // Rest means Representational state transfer. where data send in the form of JSON or XML.  Mostly data send in JSON form.
@RequestMapping("/api/v1/")
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	// Get all student records
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	
	// Get single student records
	@GetMapping("/students/{studentId}")
	public Object getSingleStudents(@PathVariable Integer studentId){
		Optional<Student> student = repo.findById(studentId);
		
		if(student.isPresent()) {
			
			return student.get();
		}
		else {
			return new Exception("Data Not found Student Table");
			
		}
//		return student.get();
		
//		List<Student> studentResponse = (List<Student>) 
//		repo.findAllById(studentId);
//			
//		return studentResponse;
		
	}
	
//	@GetMapping("/students")
//   public String homePage(Model model) {
//		
//		model.addAttribute("studentList", repo.findAll());
//		return "Home.html";
//	
//}	
	
	
}
