package com.example.eurekagrade.mapper;

import com.example.eurekagrade.pojo.Grade;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {

    @Select("select * from grade")
    List<Grade> selAllGrades();
}
