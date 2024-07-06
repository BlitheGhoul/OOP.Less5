package com_example_demo.view;

import com_example_demo.controller.StudentController;
import com_example_demo.controller.StudentGroupController;
import com_example_demo.model.DB.DataBase;

import java.util.Scanner;

public class AllView {
    private StudentView studentView = new StudentView();
    private StudentGroupView studentGroupView = new StudentGroupView();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 – Создать студента" +
                    "\n2 – Найти студента по ID" +
                    "\n3 – Распечатать информацию о всех студентах" +
                    "\n4 – Создать Студ.группу" +
                    "\n5 – Выход");

            switch (scanner.nextInt()){
                case 1 -> StudentView.createStudent();
                case 2 -> StudentView.getById();
                case 3 -> StudentView.getAllStudents();
                case 4 -> studentGroupView.createStudentGroup();
                case 5 -> System.exit(0);

                default -> System.out.println("Операция не поддерживается!");
            }

        }
    }

}
