package com.dharshini;

import com.google.gson.Gson;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class App {
    public static void main(String[] args) {

        Student s = new Student("Dharshini", 20);

        Gson gson = new Gson();

        String json = gson.toJson(s);

        System.out.println(json);
    }
}
