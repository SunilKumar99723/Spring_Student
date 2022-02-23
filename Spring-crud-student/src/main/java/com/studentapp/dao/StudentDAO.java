package com.studentapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studentapp.models.Student;

public interface StudentDAO extends JpaRepository<Student,Integer>{
	
}
