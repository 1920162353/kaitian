package com.example.eurekastudent.service.impl;

import com.example.eurekastudent.mapper.StudentMapper;
import com.example.eurekastudent.pojo.Student;
import com.example.eurekastudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selAllStudent() {
        return studentMapper.selAllStudent();
    }
}
