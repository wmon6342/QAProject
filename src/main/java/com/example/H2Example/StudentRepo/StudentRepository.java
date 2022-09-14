package com.example.H2Example.StudentRepo;

import com.example.H2Example.Student.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
