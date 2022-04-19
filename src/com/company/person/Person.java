package com.company.person;

/**
 * Author: Dhruv Thakkar
 * This abstract class presents the person class.
 */
public abstract class Person {
    private int id;
    private String name;
    private String address;

    /**
     * Constructor calls when the system or users create new child object of Person class.
     * @param id unique field per person
     * @param name name of the person
     * @param address address of the person
     */
    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /**
     * Get the id of person
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * set the id of person
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get the name of the person
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of the person
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the current address of the person
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * set the new address of the person
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
