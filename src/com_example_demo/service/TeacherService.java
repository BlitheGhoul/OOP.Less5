package com_example_demo.service;

import com_example_demo.model.DB.DataBase;
import com_example_demo.model.impl.Teacher;

public class TeacherService {

    public void addGroupId(Teacher teacher, int id){
    teacher.groups.add(id);
    }

    public Teacher createTeacher(String name, String lastName){
        int id;
        int size = DataBase.teachersDB.size();
        if (size == 0){
            id = 1;
        }
        else id = size+1;

        Teacher teacher = new Teacher(id, name, lastName);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }
}
