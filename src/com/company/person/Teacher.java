package com.company.person;

/**
 * Author: Dhruv Thakkar
 * Teacher class presents the working grade range of teacher and the salary that teacher are getting.
 */
public class Teacher extends Person{

    private int[] gradeRange;
    private double salary;

    /**
     * Teacher object will create by the user or system with following information.
     * @param id id
     * @param name name
     * @param address address
     * @param gradeRange grade range
     * @param salary salary
     */
    public Teacher(int id, String name, String address, int[] gradeRange, double salary) {
        super(id, name, address);
        this.gradeRange = gradeRange;
        this.salary = salary;
    }

    /**
     * get grade range in which teacher are taking classes.
     * @return grade range
     */
    public int[] getGradeRange() {
        return gradeRange;
    }

    /**
     * set the grade range.
     * @param gradeRange grade range
     */
    public void setGradeRange(int[] gradeRange) {
        this.gradeRange = gradeRange;
    }

    /**
     * get the salary.
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * set the salary.
     * @param salary salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * record the salary.
     * @param salary salary
     */
    public void recordSalary(double salary){
        this.salary -= salary;
    }
}
