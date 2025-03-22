package com.onepieceofjava.day10_collections_framework.arrayList;

public class MainArrayList {
    public static void main(String[] args) {

        EmployeeServiceArrayList employees = new EmployeeServiceArrayList();

        employees.addEmployee(new EmployeeArrayList(1,"daneris","IT"));
        employees.addEmployee(new EmployeeArrayList(1,"daneris","IT"));
        employees.addEmployee(new EmployeeArrayList(5,"robin","HR"));
        employees.addEmployee(new EmployeeArrayList(3,"nan","Security"));
        employees.addEmployee(new EmployeeArrayList(4,"nami","Finance"));
        employees.addEmployee(new EmployeeArrayList(2,"sanji","Kitchen"));
        employees.addEmployeeByIndex(3,new EmployeeArrayList(6,"chopper","clinic"));

        System.out.println("-----After adding of employees-----");
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----After adding new employees-----");
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----Update new employees-----");
        employees.updateEmployeeByIndex(1,new EmployeeArrayList(7,"daneris","Accounting"));
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----Removing  employees-----");
        employees.removeEmployeeById(4);
        employees.printAllEmployees();
        System.out.println();
        System.out.println("Get first employee: " + employees.getFirstEmployee());
        System.out.println("Get last employee: " + employees.getLastEmployee());
        System.out.println("Total number of employees: " + employees.getTotalNoOfEmployees());
        System.out.println("Is Empty?: " + employees.isEmpty());
        System.out.println("Employee at index 5: ?" + employees.getEmployeeById(5));

    }
}
