package com.company.person;

/**
 * Author: Dhruv Thakkar
 * Student class presents the grade and fees of student and inherits the person abstract class.
 */
public class Student extends Person{

    private int grade;
    private double fees;

    /**
     * Student object will creates with following informations.
     * @param id id
     * @param name name
     * @param address address
     * @param grade grade
     * @param fees fees
     */
    public  Student(int id, String name, String address, int grade, double fees) {
        super(id, name, address);
        this.grade = grade;
        this.fees = fees;
    }

    /**
     * get the grades
     * @return grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * set the grades
     * @param grade grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * get the fees
     * @return fees
     */
    public double getFees() {
        return fees;
    }

    /**
     * set the fees
     * @param fees fees
     */
    public void setFees(double fees){
        this.fees = fees;
    }

    /**
     * return the remaining fees.
     * @return fees
     */
    public double remainingFees(){
        return getFees();
    }

    /**
     * record the fees.
     * @param fees fees
     */
    public void recordFees(double fees){
        this.fees -= fees;
    }
}
