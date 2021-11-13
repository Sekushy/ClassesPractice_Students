package com.company;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student("Andrei", "Draghici", 24);
        Student secondStudent = new Student("Anastasia", "Boabes", 23);

        firstStudent.addGradeToStudent(8);
        firstStudent.addGradeToStudent(5);
        firstStudent.addGradeToStudent(9);
        firstStudent.addGradeToStudent(3);
        System.out.println(firstStudent.getAverageGrade());

        secondStudent.addGradeToStudent(8);
        secondStudent.addGradeToStudent(5);
        secondStudent.addGradeToStudent(9);
        System.out.println(secondStudent.getAverageGrade());
    }
}
