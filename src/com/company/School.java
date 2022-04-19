package com.company;

import com.company.person.Student;
import com.company.person.Teacher;

import java.util.List;

/**
 * Author: Dhruv Thakkar
 * School will holds the students and teachers and all cash flow management.
 */
public class School {

    private String name;
    private final List<Student> students;
    private final List<Teacher> teachers;
    private double totalMoney;

    /**
     * School object will create with the list of students and teacher in the given school.
     * @param name name of school
     * @param students students
     * @param teachers teachers
     */
    public School(String name, List<Student> students, List<Teacher> teachers){
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        totalMoney = 0.0;
    }

    /**
     * get the name of school
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * change the name of school
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the list of students in the given school.
     * @return list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add the student to the list of students.
     * @param student student
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /**
     * get the list of teachers.
     * @return teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add teacher to the list of teachers in the given school.
     * @param teacher teacher
     */
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     * get the money details of the given school.
     * @return total money.
     */
    public double getTotalMoney(){
        for (Student student : students){
            totalMoney += student.getFees();
        }

        for (Teacher teacher : teachers){
            totalMoney -= teacher.getSalary();
        }

        return totalMoney;
    }

}
