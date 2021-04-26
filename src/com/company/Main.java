package com.company;

import SchoolManagement.School;
import SchoolManagement.Student;
import SchoolManagement.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Teacher george = new Teacher(1,"george",400);
        Teacher komi = new Teacher(2,"komi",200);
        Teacher swati = new Teacher(3,"Swati",500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(george);
        teacherList.add(komi);
        teacherList.add(swati);

        Student mohit = new Student("Mohit", 1,10);
        Student machhar = new Student("Dhairya",2,9);
        Student kuldeep = new Student("Kuldeep",3,10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(mohit);
        studentList.add(machhar);
        studentList.add(kuldeep);


        School navyugSchool = new School(studentList,teacherList);
        mohit.payFees(30000);
        System.out.println("Total money earned: " + navyugSchool.getTotalMoneyEarned());
        komi.reciveSalary(100);
        System.out.println( "Paid Salary to the teacher: " + navyugSchool.getTotalExpenses() + "\nName of the teacher is: " + komi.getName());
    }
}
