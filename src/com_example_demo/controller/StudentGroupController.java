package com_example_demo.controller;

import com_example_demo.model.StudentGroup;
import com_example_demo.model.impl.Student;
import com_example_demo.model.impl.Teacher;
import com_example_demo.service.StudentGroupService;
import com_example_demo.service.StudentService;

import java.util.List;

public class StudentGroupController {

   public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList){
        return new StudentGroupService().createStudentGroup(teacher, studentList);

    }
}
