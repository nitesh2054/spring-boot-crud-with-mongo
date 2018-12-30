package com.nitesh.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitesh.practise.model.Student;
import com.nitesh.practise.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student) ;
	}

}
