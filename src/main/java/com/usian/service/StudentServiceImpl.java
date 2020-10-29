package com.usian.service;

import com.usian.entity.MyEmal;
import com.usian.entity.Student;
import com.usian.mapper.StudentMapper;
import com.usian.service.StudentService;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author zjy
 * @create 2020-10-27 10:32
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired(required = false)
    private StudentMapper studentMapper;
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired(required = false)
    @Value("${spring.mail.username}")
    private  String username;
    @Autowired(required = false)
    @Value("${spring.mail.username}")
    private  String to;

    @Override
    public List<Student> studentList() {
        List<Student> students=null;
        try {
            students= studentMapper.studentList();
            String s=null;
            s.length();
        } catch (Exception e) {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setSubject("邮件");
            simpleMailMessage.setFrom(username);
            simpleMailMessage.setTo(to);
            simpleMailMessage.setSentDate(new Date());
            simpleMailMessage.setText("你报错了赶紧来看");
            javaMailSender.send(simpleMailMessage);
        }
        return students;
    }
}
