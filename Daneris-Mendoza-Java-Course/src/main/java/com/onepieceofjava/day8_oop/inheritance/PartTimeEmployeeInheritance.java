package com.onepieceofjava.day8_oop.inheritance;

public class PartTimeEmployeeInheritance extends EmployeeInheritance{


    private double overtimePay;
    private int hoursOfWork;

    public PartTimeEmployeeInheritance(int id, String name, double salary, int hoursOfWork,double overtimePay) {
        super(id, name, salary);
        this.overtimePay = overtimePay;
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() * (hoursOfWork * overtimePay);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Hours of WOrked:" + hoursOfWork);
        System.out.println("Overtime pay:" + overtimePay);
    }


}
