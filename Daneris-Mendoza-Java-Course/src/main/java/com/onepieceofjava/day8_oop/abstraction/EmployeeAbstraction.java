package com.onepieceofjava.day8_oop.abstraction;

public abstract class EmployeeAbstraction {

    protected int id;
    protected String name;
    protected double salary;

    public EmployeeAbstraction(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateSalary();



    public void displayEmployeeInfo(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

    }
}
