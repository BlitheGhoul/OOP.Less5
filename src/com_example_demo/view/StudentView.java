package com_example_demo.view;

import com_example_demo.model.DB.DataBase;
import com_example_demo.model.impl.Student;
import com_example_demo.controller.StudentController;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    private static StudentController studentController = new StudentController();



    protected static Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID студента: ");
        int studentId = scanner.nextInt();
        Student student = studentController.getById(studentId);
        System.out.println(student);

        return student;
    }

    protected static Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        int groupId = scanner.nextInt();
        Student student = studentController.createStudent(name, lastName, groupId);
        System.out.println(student);

        return student;

    }

    protected static List<Student> getAllStudents(){
        List<Student> studentList = studentController.getAllStudents();
        System.out.println(studentList);
        return studentList;
    }
}
