package com.usian.mapper;

import com.usian.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zjy
 * @create 2020-10-27 10:26
 */

@Mapper
public interface StudentMapper {

    List<Student> studentList();

}
