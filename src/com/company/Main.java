package com.company;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("John", "Doe", 25);

        firstStudent.inputGradesFromKeyboard();
        firstStudent.inputGradesFromKeyboard();
        firstStudent.inputGradesFromKeyboard();

        System.out.println("Average grade for student " +
                firstStudent.getFirstName() +
                " " + firstStudent.getLastName() +
                " is: " + firstStudent.getAverageGrade()
        );

        firstStudent.addStudentAttendance("14-10-2021", true);
        firstStudent.addStudentAttendance("15-10-2021", true);
        firstStudent.addStudentAttendance("16-10-2021", true);
        firstStudent.printStudentAttendance();
    }
}