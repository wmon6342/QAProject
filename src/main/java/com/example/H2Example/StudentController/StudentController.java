package com.example.H2Example.StudentController;

import com.example.H2Example.Student.Student;
import com.example.H2Example.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //creating a GET mapping that retrieves all the student details from the database
    @GetMapping("/student")
    private List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    //creating a GET mapping that retrieves the details of a specific student from the database

    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudentbyID(id);
    }
    //creating a DELETE mapping that deletes the details of a specific student from the database

    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id) {
        studentService.delete(id);
    }

    //creating a POST mapping that Posts the Student details to the database

    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getId();
    }

}
