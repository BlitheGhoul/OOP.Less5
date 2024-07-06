package com_example_demo.service;

import com_example_demo.model.DB.DataBase;
import com_example_demo.model.impl.Student;

import java.util.List;


public class StudentService {
    public Student createStudent( String name, String lastName, int groupId){
        int id;
        int size = DataBase.studentsDB.size();
        if (size == 0){
            id = 1;
        }
        else id = size+1;

        Student student = new Student(id, name, lastName, groupId);
        DataBase.studentsDB.add(student);
        return student;
    }
    public Student getById(int id) throws Exception {
        Student student =  DataBase.studentsDB//Список студентов
                .stream()//Запускаем "поток", для вычислений
                .filter(s -> s.getId() == id)//Вызываем метод "Фильтр", фильтруя по id
                .findFirst()// Возвращает первого найденного студента
                .orElse(null);// Если не нашли - вернуть null

        if (student == null){
            throw new Exception("Student not found :(");

        }
        return student;

    }
    public List<Student> getAllStudents(){
        return DataBase.studentsDB;
    }
}
