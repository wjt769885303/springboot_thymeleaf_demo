package com.qf.service.impl;

import com.qf.dao.ClassesMapper;
import com.qf.dao.StudentMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private IClassesService iClassesService;




    @Override
    public List<Student> queryAll() {
        List<Student> students = studentMapper.selectList(null);
        for (Student student : students) {
            Classes classes = iClassesService.queryById(student.getCid());
            student.setClasses(classes);
        }
         return students;
    }

    @Override
    public int deleteById(Integer sid) {
        return studentMapper.deleteById(sid);
    }


}
