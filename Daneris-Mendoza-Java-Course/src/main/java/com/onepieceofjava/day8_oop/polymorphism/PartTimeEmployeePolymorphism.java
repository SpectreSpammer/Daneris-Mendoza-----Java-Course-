package com.onepieceofjava.day8_oop.polymorphism;

public class PartTimeEmployeePolymorphism implements EmployeePolymorphism{
    private int id;
    private String name;
    private double salary;
    private double overtimePay;
    private int workingHours;

    public PartTimeEmployeePolymorphism(int id, String name, double salary, double overtimePay,int workingHours) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.overtimePay = overtimePay;
        this.workingHours = workingHours;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + (overtimePay * workingHours);
    }
}
