package com_example_demo.model.DB;

import com_example_demo.model.impl.Student;
import com_example_demo.model.impl.Teacher;
import com_example_demo.service.TeacherService;

import java.util.ArrayList;
import java.util.List;

//Симуляция БД
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Vasya", "Ivanov");
        new TeacherService().addGroupId(teacher, 1);
        teachersDB.add(teacher);

        Student s1 = new Student(1, "Vanya", "Pavlov", 1);
        Student s2 = new Student(2, "Veniamin", "Petrov", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);

    }
}
