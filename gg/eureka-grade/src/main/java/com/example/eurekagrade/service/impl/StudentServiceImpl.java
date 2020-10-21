package com.example.eurekagrade.service.impl;

import com.example.eurekagrade.mapper.StudentMapper;
import com.example.eurekagrade.pojo.Grade;
import com.example.eurekagrade.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Grade> selAllGrades() {
        return studentMapper.selAllGrades();
    }
}
