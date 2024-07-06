package com_example_demo.model.impl;

import com_example_demo.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    public final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

}
