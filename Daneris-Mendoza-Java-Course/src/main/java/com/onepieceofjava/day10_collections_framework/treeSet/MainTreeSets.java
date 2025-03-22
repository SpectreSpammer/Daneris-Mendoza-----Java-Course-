package com.onepieceofjava.day10_collections_framework.treeSet;

import com.onepieceofjava.day10_collections_framework.linkedList.EmployeeLinkedList;

import java.util.Comparator;

public class MainTreeSets {
    public static void main(String[] args) {

        EmployeeServiceTreeSet employees = new EmployeeServiceTreeSet();
        employees.addEmployee(new EmployeeTreeSet(1,"daneris","IT"));
        employees.addEmployee(new EmployeeTreeSet(1,"dasdsadas","Devops"));
        employees.addEmployee(new EmployeeTreeSet(5,"robin","HR"));
        employees.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employees.addEmployee(new EmployeeTreeSet(4,"nami","Finance"));
        employees.addEmployee(new EmployeeTreeSet(2,"sanji","Kitchen"));

        System.out.println("Employees adding/sorting by Id");
        employees.printAllEmployees();
        System.out.println();
        System.out.println("First  Employee: " + employees.getFirstEmployee());
        System.out.println("Last  Employee: " + employees.getLastEmployee());
        System.out.println();

        EmployeeServiceTreeSet employeeByname = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getName)
        );
        employeeByname.addEmployee(new EmployeeTreeSet(1,"daneris","IT"));
        employeeByname.addEmployee(new EmployeeTreeSet(1,"dasdsadas","Devops"));
        employeeByname.addEmployee(new EmployeeTreeSet(5,"robin","HR"));
        employeeByname.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employeeByname.addEmployee(new EmployeeTreeSet(4,"nami","Finance"));
        employeeByname.addEmployee(new EmployeeTreeSet(2,"sanji","Kitchen"));

        System.out.println("Employees adding/sorting by Name");
        employeeByname.printAllEmployees();
        System.out.println();

        EmployeeServiceTreeSet employeeByDept = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getDept)
        );
        employeeByDept.addEmployee(new EmployeeTreeSet(1,"daneris","IT"));
        employeeByDept.addEmployee(new EmployeeTreeSet(1,"dasdsadas","Devops"));
        employeeByDept.addEmployee(new EmployeeTreeSet(5,"robin","HR"));
        employeeByDept.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employeeByDept.addEmployee(new EmployeeTreeSet(4,"nami","Finance"));
        employeeByDept.addEmployee(new EmployeeTreeSet(2,"sanji","Kitchen"));

        System.out.println("Employees adding/sorting by dept");
        employeeByDept.printAllEmployees();
        System.out.println();

    }
}
