package com.example.eurekagrade.controller;

import com.example.eurekagrade.pojo.Grade;
import com.example.eurekagrade.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aa")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/grades")
    public List<Grade> findStudents() throws Exception{
        return studentService.selAllGrades();
    }

}
