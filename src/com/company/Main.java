package com.company;

import com.company.person.Student;
import com.company.person.Teacher;

import java.util.ArrayList;

/**
 * Author: Dhruv Thakkar
 * This class drives the school-management application.
 */
public class Main {

    public static void main(String[] args) {

        School school = new School("Sahjanand primary school", new ArrayList<>(), new ArrayList<>());

        Student[] students = new Student[6];

        students[0] = new Student(1, "Vishal", "Jivraj Park", 1, 3000);
        students[1] = new Student(2, "Sapan", "Aambavadi", 1, 3000);
        students[2] = new Student(3, "Jainam", "Vasana", 1, 3000);
        students[3] = new Student(4, "Harshil", "Jivraj Park", 1, 3000);
        students[4] = new Student(5, "Dhruv", "Jivraj Park", 1, 3000);
        students[5] = new Student(6, "Parth", "Jivraj Park", 1, 3000);

        for (Student student : students){
            school.addStudent(student);
        }

        Teacher[] teachers = new Teacher[2];

        teachers[0] = new Teacher(1, "Apsra teacher", null, new int[]{1, 2}, 15000);
        teachers[1] = new Teacher(2, "Pallavi teacher", null, new int[]{1, 5}, 15000);

        for (Teacher teacher : teachers){
            school.addTeacher(teacher);
        }

        System.out.println(school.getTotalMoney());

    }
}
