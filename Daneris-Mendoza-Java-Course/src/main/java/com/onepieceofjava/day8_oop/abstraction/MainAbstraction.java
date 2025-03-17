package com.onepieceofjava.day8_oop.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {


        EmployeeAbstraction fte = new FullTimeEmployeeAbstraction(101,"daneris",50000.75,25000.75);
        EmployeeAbstraction pt = new PartTimeEmployeeAbstraction(102,"nan",60000.75,25000,3,2500.75);

        fte.displayEmployeeInfo();
        System.out.println("Total salary for Full Time Employee: " + fte.calculateSalary());
        System.out.println();

        pt.displayEmployeeInfo();
        System.out.println("Total salary for Part Time Employee: " + pt.calculateSalary());
        System.out.println();
    }
}
