package com.qf.service;

import com.qf.entity.Classes;
import com.qf.entity.Student;

import java.util.List;

public interface IStudentService {

    public List<Student> queryAll();

    public int deleteById(Integer sid);
}
