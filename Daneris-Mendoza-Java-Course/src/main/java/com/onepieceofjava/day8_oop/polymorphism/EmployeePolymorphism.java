package com.onepieceofjava.day8_oop.polymorphism;

public interface EmployeePolymorphism {

    int getId();
    String getName();
    double getSalary();
    double calculateSalary();

    default void displayEmployeeInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());

    }
}
