package com.onepieceofjava.day9_exceptions.customizedException;

public class MainCustomizedException {
    public static void main(String[] args)  {

        EmployeeException employee = new EmployeeException("daneris",50000.75);

        try{

            employee.raiseSalary(34);
            System.out.println("34% raise salary");

            employee.raiseSalary(-10);
            System.out.println("this line will not be printed out");

        } catch (InvalidRaiseException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }finally {
            System.out.println("Salary has been processing......");
        }

        System.out.println(employee.getSalary());
    }
}
