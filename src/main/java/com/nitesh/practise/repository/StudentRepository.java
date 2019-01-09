package com.nitesh.practise.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nitesh.practise.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
