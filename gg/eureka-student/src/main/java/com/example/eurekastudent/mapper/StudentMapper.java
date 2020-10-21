package com.example.eurekastudent.mapper;

import com.example.eurekastudent.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {
    @Select("select * from student")
    List<Student> selAllStudent();
}
