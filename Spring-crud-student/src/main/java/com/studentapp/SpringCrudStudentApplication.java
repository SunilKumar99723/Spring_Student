package com.studentapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//import com.example.model.Employees;
import com.studentapp.models.Student;
import com.studentapp.repository.StudentRepo;

@SpringBootApplication
public class SpringCrudStudentApplication {

//	@Autowired
//	private StudentRepo repo;
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCrudStudentApplication.class, args);
	}
	
//	@Override
//    public void run(String... args) throws Exception {
//		
//    	Student s1= new Student("Sunil", "Jharkhand", "sk@gmail.com");
//    	Student s2= new Student("Bablu", "Jharkhand", "bk@gmail.com");
//    	Student s3= new Student("Prem", "Jharkhand", "pk@gmail.com");
//    	Student s4= new Student("Mukesh", "Jharkhand", "mk@gmail.com");
//    	Student s5= new Student("Raju", "Jharkhand", "rk@gmail.com");
//    	
//    	repo.save(s1);
//    	repo.save(s2);
//    	repo.save(s3);
//    	repo.save(s4);
//    	repo.save(s5);
    	
//    	List < Student > students = repo.findAll();
//		 students.forEach(student -> System.out.println(student.toString()));
		
//		String sql = "SELECT * FROM STUDENTS";
//		List<Student> student= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
//		student.forEach(System.out :: println);
//	}
	
	
	
}
