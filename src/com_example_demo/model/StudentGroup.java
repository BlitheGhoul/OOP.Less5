package com_example_demo.model;

import com_example_demo.model.impl.Student;
import com_example_demo.model.impl.Teacher;
import com_example_demo.service.TeacherService;

import java.util.List;

public class StudentGroup {
   public Teacher teacher;
    public List<Student> studentList;
    public static int studentGroupId;

    @Override
    public String toString() {
        return "StudentGroup №" + studentGroupId +
                "{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                "} ";
    }
}
