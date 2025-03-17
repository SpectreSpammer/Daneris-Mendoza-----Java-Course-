package com.onepieceofjava.day8_oop.abstraction;

public class PartTimeEmployeeAbstraction extends EmployeeAbstraction{

    private double overtimePay;
    private int hoursOfWork;

    public PartTimeEmployeeAbstraction(int id, String name, double salary, double bonus,int hoursOfWork,double overtimePay) {
        super(id, name, salary);
        this.overtimePay = overtimePay;
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public double calculateSalary() {
        return salary + (overtimePay * hoursOfWork );
    }
}
