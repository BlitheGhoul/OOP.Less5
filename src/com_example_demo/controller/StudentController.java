package com_example_demo.controller;

import com_example_demo.model.impl.Student;
import com_example_demo.service.StudentService;

import java.util.List;

public class StudentController {
    private static StudentService studentService = new StudentService();
    public static Student createStudent(String name, String lastName, int groupId){
        return studentService.createStudent(name, lastName, groupId);
    }
    public Student getById(int id){

        Student student = null;
    try{
        student = studentService.getById(id);
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
        return student;
    }
    
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
