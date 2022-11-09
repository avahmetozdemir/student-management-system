package com.example.studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {

        //How many new students we want to add
        System.out.println("Enter number of new student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        //Create n number of new students

        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();

        }
        for (int n = 0; n < numberOfStudents; n++){

            System.out.println(students[n].toString());
        }

    }
}
