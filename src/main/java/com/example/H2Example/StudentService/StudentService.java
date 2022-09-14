package com.example.H2Example.StudentService;

import com.example.H2Example.Student.Student;
import com.example.H2Example.StudentRepo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    //get a specific record

    public Student getStudentbyID(int id){
        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);

    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }


}
