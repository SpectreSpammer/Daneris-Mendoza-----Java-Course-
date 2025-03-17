package com.onepieceofjava.day8_oop.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        EmployeeEncapsulation employeeEncapsulation = new EmployeeEncapsulation(101,"daneris", 50000.75);

        //getters
        System.out.println("Employee Id: " + employeeEncapsulation.getId());
        System.out.println("Employee name: " + employeeEncapsulation.getName());
        System.out.println("Employee salary: " + employeeEncapsulation.getSalary());

        System.out.println();
        //modify using setters
        employeeEncapsulation.setId(201);
        employeeEncapsulation.setName("Nan");
        employeeEncapsulation.setSalary(60000.75);

        System.out.println("Employee Id: " + employeeEncapsulation.getId());
        System.out.println("Employee name: " + employeeEncapsulation.getName());
        System.out.println("Employee salary: " + employeeEncapsulation.getSalary());

        //invalid
        System.out.println();
        employeeEncapsulation.setSalary(-60000.75);
        System.out.println();

        employeeEncapsulation.salaryIncreaseByPercentage(10);
    }
}
