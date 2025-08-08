package com.masai.entity;

public class Student extends Person{
    private int roll;
    private String grade;

    public Student(String name, int age, Address address, int roll, String grade) {
        super(name, age, address);
        this.roll = roll;
        this.grade = grade;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" Roll: "+roll+" Grade: "+grade);
    }
}
