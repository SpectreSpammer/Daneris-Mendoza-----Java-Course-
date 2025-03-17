package com.onepieceofjava.day8_oop.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        EmployeePolymorphism fte = new FullTimeEmployeePolymorphism(101,"daneris", 50000.75,25000.75);
        fte.displayEmployeeInfo();
        System.out.println();

        EmployeePolymorphism pt = new PartTimeEmployeePolymorphism(102,"nan", 60000.75,1500,4);
        pt.displayEmployeeInfo();
    }
}
