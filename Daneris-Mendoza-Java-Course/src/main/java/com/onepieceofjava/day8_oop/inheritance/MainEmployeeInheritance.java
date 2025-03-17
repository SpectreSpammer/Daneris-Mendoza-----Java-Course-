package com.onepieceofjava.day8_oop.inheritance;

public class MainEmployeeInheritance {
    public static void main(String[] args) {

        EmployeeInheritance regularEmployee = new EmployeeInheritance(101,"daneris",50000.75);
        FullTimeEmployeeInheritance fte = new FullTimeEmployeeInheritance(102,"nan",60000.75,25000.75);
        PartTimeEmployeeInheritance pt = new PartTimeEmployeeInheritance(103,"nami",70000.75,4,2500.75);

        System.out.println("Regular Employee");
        regularEmployee.displayEmployeeInfo();
        regularEmployee.calculateSalary();
        System.out.println();

        System.out.println("Full Time Employee");
        fte.displayEmployeeInfo();
        fte.calculateSalary();
        System.out.println();

        System.out.println("Part Time Employee");
        pt.displayEmployeeInfo();
        pt.calculateSalary();
        System.out.println();
    }
}
