package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService iStudentService;


    @RequestMapping("/queryAll")
    public String queryAll(Model model){

        List<Student> students = iStudentService.queryAll();

        model.addAttribute("students",students);

        return "stulist";

    }



    @RequestMapping("/delete")
    public String delete(Integer sid){

        int i = iStudentService.deleteById(sid);

        return "redirect:/student/queryAll";

    }

}
