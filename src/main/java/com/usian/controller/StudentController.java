package com.usian.controller;

import com.usian.entity.Student;
import com.usian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @author zjy
 * @create 2020-10-27 10:27
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("studentList")
    public  String studentList(Model model){
        List<Student> students = studentService.studentList();
        model.addAttribute("students", students);
        return "show";
    }


}
