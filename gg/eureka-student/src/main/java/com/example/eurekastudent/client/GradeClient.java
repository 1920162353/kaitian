package com.example.eurekastudent.client;

import com.example.eurekastudent.pojo.Grade;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("eureka-grade")
public interface GradeClient {

    @GetMapping("/aa/grades")
    public List<Grade> findStudents();
}
