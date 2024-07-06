package com_example_demo.view;

import com_example_demo.controller.StudentController;
import com_example_demo.controller.StudentGroupController;
import com_example_demo.model.StudentGroup;
import com_example_demo.model.impl.Teacher;

import java.util.Scanner;

public class StudentGroupView {
   private StudentGroupController studentGroupController = new StudentGroupController();

    protected StudentGroup createStudentGroup(){
        StudentGroup studentGroup;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные преподавателя:" +
                "\n Имя:  ");
        String name = scanner.nextLine();
        System.out.println("\n Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.println("\n ID: ");
        int id = scanner.nextInt();
        Teacher teacher = new Teacher(id, name, lastName);
        studentGroup = studentGroupController.createStudentGroup(teacher, new StudentController().getAllStudents());
        System.out.println(studentGroup);
        return studentGroup;
    }
}
