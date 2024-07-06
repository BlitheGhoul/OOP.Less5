package com_example_demo.service;

import com_example_demo.model.StudentGroup;
import com_example_demo.model.impl.Student;
import com_example_demo.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
StudentGroup studentGroup = new StudentGroup();
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList){
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.teacher = teacher;
        for (Student student : studentList){
            if (student.groupId == StudentGroup.studentGroupId){
                studentGroup.studentList.add(student);
            }

        }
        return studentGroup;
    }
}
