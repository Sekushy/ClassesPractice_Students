package com.company;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<String> comments;
    private ArrayList<Integer> grades;
    // TODO: Prezenta
    // CONSTRUCTOR

    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    // GETTERS - GET Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // SETTERS - SET Methods
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addGradeToStudent(int grade){
        grades.add(grade);
    }

    public void printStudentGrades() {
        for (int i =0; i < grades.size(); i++) {
            System.out.println(grades.get(i) + " ");
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            // sum = sum + grades.get(i);
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}