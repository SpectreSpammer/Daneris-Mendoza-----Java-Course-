package com.onepieceofjava.day10_collections_framework.hashSet;

public class MainHashSets {
    public static void main(String[] args) {

        EmployeeHashSetService employeeService = new EmployeeHashSetService();

        EmployeeHashSet employee1 = new EmployeeHashSet(1,"daneris","IT");
        EmployeeHashSet employee2 = new EmployeeHashSet(2,"nan","Devops");
        EmployeeHashSet employee7 = new EmployeeHashSet(2,"nan","Devops");
        EmployeeHashSet employee5 = new EmployeeHashSet(5,"nami","Sales");
        EmployeeHashSet employee6 = new EmployeeHashSet(1,"daneris","IT");
        EmployeeHashSet employee3 = new EmployeeHashSet(3,"robin","HR");
        EmployeeHashSet employee4 = new EmployeeHashSet(4,"sanji","Kitchen");

        System.out.println("-----Adding of Employees-----");
        System.out.println("Added employee #1: " + employeeService.addEmployee(employee1));
        System.out.println("Added employee #2: " + employeeService.addEmployee(employee2));
        System.out.println("Added employee #3: " + employeeService.addEmployee(employee3));
        System.out.println("Added employee #4: " + employeeService.addEmployee(employee4));
        System.out.println("Added employee #5: " + employeeService.addEmployee(employee5));
        System.out.println("Added employee #6: " + employeeService.addEmployee(employee6));
        System.out.println("Added employee #7: " + employeeService.addEmployee(employee7));
        System.out.println();

        employeeService.printEmployees();
        System.out.println();

        System.out.println("Employees count: " + employeeService.getTotalEmployees());
        System.out.println();

        System.out.println("Checking if the employee is exist?");
        System.out.println("Contains employee #1: " + employeeService.containsEmployee(employee1));
        System.out.println("Contains employee #2: " + employeeService.containsEmployee(employee2));
        System.out.println("Contains employee #3: " + employeeService.containsEmployee(employee3));
        System.out.println("Contains employee #4: " + employeeService.containsEmployee(employee4));
        System.out.println("Contains employee #5: " + employeeService.containsEmployee(employee5));
        System.out.println("Contains employee #6: " + employeeService.containsEmployee(employee6));
        System.out.println();


        System.out.println("Removed employee 1 " + employeeService.removeEmployee(employee1));
        employeeService.printEmployees();
        System.out.println();

        System.out.println("Employee hashcode employee #1" + employee1.hashCode());
        System.out.println("Employee hashcode employee #2" + employee2.hashCode());
        System.out.println("Employee hashcode employee #3" + employee3.hashCode());
        System.out.println("Employee hashcode employee #4" + employee4.hashCode());
        System.out.println("Employee hashcode employee #5" + employee5.hashCode());
        System.out.println("Employee hashcode employee #6" + employee6.hashCode());


    }
}
