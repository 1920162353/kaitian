package com.example.eurekastudent.controller;

import com.example.eurekastudent.client.GradeClient;
import com.example.eurekastudent.pojo.Grade;
import com.example.eurekastudent.pojo.Student;
import com.example.eurekastudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ss")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private GradeClient gradeClient;

    @GetMapping("/students")
    public List<Student> findStudents(){
        List<Student> list = studentService.selAllStudent();
        return studentService.selAllStudent();
    }

    @GetMapping("/grades")
    public List<Grade> findGrades(){
        return gradeClient.findStudents();
    }
}
