package com.masai.entity;

public class Employees {

    private String name;
    private String role;
    private String salary;

    public Employees(String name, String role, String salary) {
        this.name = name;
        this.role = role;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
