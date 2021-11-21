package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private ArrayList<String> comments;
    private ArrayList<Integer> grades;
    private ArrayList<Presence> attendanceList;

    // CONSTRUCTOR
    public Student(String firstName, String lastName, int age){
        super(firstName, lastName, age);
        this.grades = new ArrayList<>();
        this.attendanceList = new ArrayList<>();
    }

    private void addGradeToStudent(int grade){
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
            // Linia de jos este echivalent cu sum = sum + grades.get(i);
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public void addStudentAttendance(String date, Boolean isPresent) {
        Presence presence = new Presence(isPresent, date);
        attendanceList.add(presence);
    }

    public void printStudentAttendance() {
        for (int i = 0; i < attendanceList.size(); i++)
            System.out.println(attendanceList.get(i));
    }

    public void inputGradesFromKeyboard() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the student grade: ");
        addGradeToStudent(input.nextInt());
    }
}