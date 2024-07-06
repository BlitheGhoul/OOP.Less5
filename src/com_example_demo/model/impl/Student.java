package com_example_demo.model.impl;

import com_example_demo.model.User;

public class Student extends User {
   public int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }
}
